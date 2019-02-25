/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import facade.ClassicFacade;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mappers.CustomerSimpleOrders;

/**
 *
 * @author oerte
 */
public class TesterGetCustomerSimpleOrdersID {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        ClassicFacade facade = new ClassicFacade(emf);

        int customerId = 363;

        CustomerSimpleOrders customerSimpleOrders = facade.getCustomerSimpleOrders(customerId);

        System.out.println(customerSimpleOrders.getCustomerName());
        System.out.println(customerSimpleOrders.getFirstName());
        System.out.println(customerSimpleOrders.getLastName());
        System.out.println(customerSimpleOrders.getOrderCount());

    }
}
