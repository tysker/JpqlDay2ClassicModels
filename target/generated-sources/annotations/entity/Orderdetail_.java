package entity;

import entity.OrderClassic;
import entity.OrderdetailPK;
import entity.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-24T14:45:47")
@StaticMetamodel(Orderdetail.class)
public class Orderdetail_ { 

    public static volatile SingularAttribute<Orderdetail, Product> product;
    public static volatile SingularAttribute<Orderdetail, OrderdetailPK> orderdetailPK;
    public static volatile SingularAttribute<Orderdetail, Double> priceeach;
    public static volatile SingularAttribute<Orderdetail, OrderClassic> orderClassic;
    public static volatile SingularAttribute<Orderdetail, Short> orderlinenumber;
    public static volatile SingularAttribute<Orderdetail, Integer> quantityordered;

}