/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import entity.Customer;
import facade.ClassicFacade;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author oerte
 */
public class TesterGetAllCustomersInCity {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        ClassicFacade facade = new ClassicFacade(emf);

        List<Customer> customers = facade.getAllCustomersInCity("Madrid");

        int count = 1;
        for (Customer customer : customers) {
            System.out.println(count + ": " + customer.getCountry());
            count++;
        }
    }

}
