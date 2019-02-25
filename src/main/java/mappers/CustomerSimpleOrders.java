/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappers;

/**
 *
 * @author oerte
 */
public class CustomerSimpleOrders {
    
    private String firstName;
    private String lastName;
    private String customerName;
    private long orderCount;

    public CustomerSimpleOrders(String firstName, String lastName, String customerName, long orderCount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerName = customerName;
        this.orderCount = orderCount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(long orderCount) {
        this.orderCount = orderCount;
    }

    @Override
    public String toString() {
        return "CustomerSimpleOrders{" + "firstName=" + firstName + ", lastName=" + lastName + ", customerName=" + customerName + ", orderCount=" + orderCount + '}';
    }
    
    
    
    
    
    
}
