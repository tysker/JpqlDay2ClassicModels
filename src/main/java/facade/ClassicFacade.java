/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Customer;
import entity.Employee;
import entity.Office;
import entity.OrderClassic;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import mappers.CustomerSimple;
import mappers.CustomerSimpleOrders;

/**
 *
 * @author oerte
 */
public class ClassicFacade {

    EntityManagerFactory emf;

    public ClassicFacade(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public Employee createEmployee(String lastName, String firstName, String extension, String email, String jobTitle, String officeCode) {
        Employee emp = new Employee(lastName, firstName, extension, email, jobTitle);
        EntityManager em = emf.createEntityManager();
        Office of = em.find(Office.class, officeCode);
        emp.setOffice(of);

        try {

            em.getTransaction().begin();
            em.persist(emp);
            em.getTransaction().commit();
            return emp;

        } finally {
            em.close();
        }
    }

    public long employeeCount() {
        EntityManager em = emf.createEntityManager();
        try {
            Query q = em.createQuery("select count(e) from Employee e");
            long num = (long) q.getSingleResult();
            System.out.println(num);
            return num;
            //return (long) q.getSingleResult();
        } finally {
            em.close();
        }

    }

    public List<Employee> getAllEmployees() {
        EntityManager em = emf.createEntityManager();

        try {
            Query q = em.createQuery("select e from Employee e");
            return q.getResultList();

        } finally {
            em.close();
        }

    }

    public List<Customer> getAllCustomersInCity(String city) {
        EntityManager em = emf.createEntityManager();

        try {
            Query q = em.createQuery("select c from Customer c where c.city = :city");
            q.setParameter("city", city);
            List<Customer> customers = q.getResultList();
            return customers;

        } finally {
            em.close();
        }

    }

    public List<OrderClassic> getOrdersOnHold(String status) {
        EntityManager em = emf.createEntityManager();

        try {
            Query q = em.createQuery("select o from OrderClassic o where o.status = :status");
            q.setParameter("status", status);
            List<OrderClassic> orders = q.getResultList();
            return orders;
        } finally {
            em.close();
        }

    }

    public Customer findCustomer(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            Query q = em.createNamedQuery("Customer.findByCustomernumber");
            return (Customer) q.setParameter("customernumber", id).getSingleResult();
        } finally {
            em.close();
        }
    }

    public List<OrderClassic> getOrdersOnHoldForCustomer(int customerNumber) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            List<OrderClassic> orders = new ArrayList();
            Query q = em.createQuery("SELECT o FROM OrderClassic o WHERE o.status = :status AND o.customer.customernumber = :customernumber");
            q.setParameter("status", "On Hold");
            q.setParameter("customernumber", customerNumber);
            orders = q.getResultList();
            em.getTransaction().commit();
            return orders;
        } finally {
            em.close();
        }
    }

    public List<String> getCustomerNamesSorted() {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            List<String> names = new ArrayList();
            Query q = em.createQuery("SELECT c.customername FROM Customer c ORDER BY c.customername ASC");
            names = q.getResultList();
            em.getTransaction().commit();
            return names;
        } finally {
            em.close();
        }

    }

    public List<CustomerSimple> getCustomersSimple() {
        EntityManager em = emf.createEntityManager();
        String queryStr = "SELECT NEW mappers.CustomerSimple "
                + " (c.contactfirstname, c.contactlastname, c.customername) "
                + " FROM Customer AS c";
        TypedQuery<CustomerSimple> query = em.createQuery(queryStr, CustomerSimple.class);
        List<CustomerSimple> results = query.getResultList();
        return results;
    }

    public CustomerSimple getCustomerSimple(int id) {
        EntityManager em = emf.createEntityManager();
        String queryStr = "SELECT NEW mappers.CustomerSimple (c.contactfirstname, c.contactlastname, c.customername) "
                + "FROM Customer c WHERE c.customernumber = :customernumber";
        TypedQuery<CustomerSimple> query = em.createQuery(queryStr, CustomerSimple.class);
        query.setParameter("customernumber", id);
        return query.getSingleResult();

    }
    
    public List<CustomerSimpleOrders> getCustomersSimpleOrders() {
        EntityManager em = emf.createEntityManager();
        String queryStr = "SELECT NEW mappers.CustomerSimpleOrders"
                + "(c.contactfirstname, c.contactlastname, c.customername, "
                + "(SELECT count(oc) "
                + "FROM OrderClassic oc "
                + "WHERE oc.customernumber = c))"
                + "FROM Customer AS c";
        TypedQuery<CustomerSimpleOrders> query = em.createQuery(queryStr, CustomerSimpleOrders.class);
        return query.getResultList();
    }
    
    
    public CustomerSimpleOrders getCustomerSimpleOrders(int id) {
        EntityManager em = emf.createEntityManager();
        Customer customer = findCustomer(id);
        String queryStr = "SELECT NEW mappers.CustomerSimpleOrders"
                + "(c.contactfirstname, c.contactlastname, c.customername, count(oc)) "
                + "FROM Customer AS c, OrderClassic AS oc "
                + "WHERE c.customernumber = :customernumber AND oc.customernumber = :customernumberOC";
        TypedQuery<CustomerSimpleOrders> query = em.createQuery(queryStr, CustomerSimpleOrders.class);
        query.setParameter("customernumber", id);
        query.setParameter("customernumberOC", customer);
        return query.getSingleResult();
    }



}
