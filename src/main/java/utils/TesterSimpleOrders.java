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
import mappers.CustomerSimpleOrders;

/**
 *
 * @author oerte
 */
public class TesterSimpleOrders {
    
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        ClassicFacade facade = new ClassicFacade(emf);
        
        List<CustomerSimpleOrders> customerSimpleOrders = facade.getCustomersSimpleOrders();
        
        System.out.println(customerSimpleOrders.get(10).getCustomerName());
        System.out.println(customerSimpleOrders.get(10).getFirstName());
        System.out.println(customerSimpleOrders.get(10).getLastName());
        System.out.println(customerSimpleOrders.get(10).getOrderCount());
        
        
    }
    
}
