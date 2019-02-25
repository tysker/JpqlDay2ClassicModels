package entity;

import entity.Customer;
import entity.Orderdetail;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-24T14:45:47")
@StaticMetamodel(OrderClassic.class)
public class OrderClassic_ { 

    public static volatile SingularAttribute<OrderClassic, String> comments;
    public static volatile SingularAttribute<OrderClassic, Integer> ordernumber;
    public static volatile CollectionAttribute<OrderClassic, Orderdetail> orderdetailCollection;
    public static volatile SingularAttribute<OrderClassic, Date> shippeddate;
    public static volatile SingularAttribute<OrderClassic, Date> orderdate;
    public static volatile SingularAttribute<OrderClassic, Date> requireddate;
    public static volatile SingularAttribute<OrderClassic, String> status;
    public static volatile SingularAttribute<OrderClassic, Customer> customer;

}