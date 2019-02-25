package entity;

import entity.Orderdetail;
import entity.Productline;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-24T14:45:47")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, String> productscale;
    public static volatile SingularAttribute<Product, Productline> productline;
    public static volatile SingularAttribute<Product, String> productcode;
    public static volatile SingularAttribute<Product, String> productvendor;
    public static volatile SingularAttribute<Product, String> productdescription;
    public static volatile SingularAttribute<Product, Double> buyprice;
    public static volatile SingularAttribute<Product, Short> quantityinstock;
    public static volatile SingularAttribute<Product, Double> msrp;
    public static volatile CollectionAttribute<Product, Orderdetail> orderdetailCollection;
    public static volatile SingularAttribute<Product, String> productname;

}