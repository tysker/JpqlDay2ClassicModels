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
public class CustomerSimple {

    private String firstName;
    private String lastName;
    private String customerName;

    public CustomerSimple(String firstName, String lastName, String customerName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerName = customerName;
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

    @Override
    public String toString() {
        return "CustomerSimple{" + "firstName=" + firstName + ", lastName=" + lastName + ", customerName=" + customerName + '}';
    }

}
