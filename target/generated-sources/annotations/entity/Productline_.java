package entity;

import entity.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-24T14:45:47")
@StaticMetamodel(Productline.class)
public class Productline_ { 

    public static volatile SingularAttribute<Productline, String> productline;
    public static volatile SingularAttribute<Productline, byte[]> image;
    public static volatile SingularAttribute<Productline, String> htmldescription;
    public static volatile SingularAttribute<Productline, String> textdescription;
    public static volatile CollectionAttribute<Productline, Product> productCollection;

}