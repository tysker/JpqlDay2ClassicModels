/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import entity.OrderClassic;
import facade.ClassicFacade;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author oerte
 */
public class TesterGetOrdersOnHoldByNumber {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        ClassicFacade facade = new ClassicFacade(emf);
        
        List<OrderClassic> orders = facade.getOrdersOnHoldForCustomer(144);
        
        for (OrderClassic order : orders) {
            System.out.println(order.getOrdernumber());
        }
        
        
        
    }

}
