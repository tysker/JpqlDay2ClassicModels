/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import facade.ClassicFacade;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mappers.CustomerSimple;

/**
 *
 * @author oerte
 */
public class TestergetCustomerSimpleById {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        ClassicFacade facade = new ClassicFacade(emf);
        
        CustomerSimple cs =  facade.getCustomerSimple(103);
        
        System.out.println(cs);
    }
}
