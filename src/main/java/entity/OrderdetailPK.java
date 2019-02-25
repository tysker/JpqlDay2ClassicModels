/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author oerte
 */
@Embeddable
public class OrderdetailPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ordernumber", nullable = false)
    private int ordernumber;
    @Basic(optional = false)
    @Column(name = "productcode", nullable = false, length = 15)
    private String productcode;

    public OrderdetailPK() {
    }

    public OrderdetailPK(int ordernumber, String productcode) {
        this.ordernumber = ordernumber;
        this.productcode = productcode;
    }

    public int getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(int ordernumber) {
        this.ordernumber = ordernumber;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) ordernumber;
        hash += (productcode != null ? productcode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderdetailPK)) {
            return false;
        }
        OrderdetailPK other = (OrderdetailPK) object;
        if (this.ordernumber != other.ordernumber) {
            return false;
        }
        if ((this.productcode == null && other.productcode != null) || (this.productcode != null && !this.productcode.equals(other.productcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.joergoertel.classicmodels.OrderdetailPK[ ordernumber=" + ordernumber + ", productcode=" + productcode + " ]";
    }
    
}
