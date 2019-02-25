/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import facade.ClassicFacade;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mappers.CustomerSimple;

/**
 *
 * @author oerte
 */
public class TesterGetCustomerSimple {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        ClassicFacade facade = new ClassicFacade(emf);

        List<CustomerSimple> customerSimple = facade.getCustomersSimple();
        
        for (CustomerSimple customer : customerSimple) {
            System.out.println(customer);
        }

//        System.out.println(customerSimple.get(0).getCustomerName());
//        System.out.println(customerSimple.get(0).getFirstName());
//        System.out.println(customerSimple.get(0).getLastName());
    }

}
