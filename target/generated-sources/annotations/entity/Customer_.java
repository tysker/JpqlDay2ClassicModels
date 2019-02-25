package entity;

import entity.Employee;
import entity.OrderClassic;
import entity.Payment;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-24T14:45:47")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, Integer> customernumber;
    public static volatile SingularAttribute<Customer, String> country;
    public static volatile SingularAttribute<Customer, String> contactfirstname;
    public static volatile SingularAttribute<Customer, String> city;
    public static volatile SingularAttribute<Customer, Employee> employee;
    public static volatile CollectionAttribute<Customer, Payment> paymentCollection;
    public static volatile SingularAttribute<Customer, String> contactlastname;
    public static volatile SingularAttribute<Customer, String> phone;
    public static volatile SingularAttribute<Customer, String> postalcode;
    public static volatile CollectionAttribute<Customer, OrderClassic> orderClassicCollection;
    public static volatile SingularAttribute<Customer, String> addressline2;
    public static volatile SingularAttribute<Customer, String> addressline1;
    public static volatile SingularAttribute<Customer, String> state;
    public static volatile SingularAttribute<Customer, String> customername;
    public static volatile SingularAttribute<Customer, Double> creditlimit;

}