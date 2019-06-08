package edu.mum.cs.cs425.prodmgmt.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "products")
public class Product {
  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pid;

    @Column(name = "product_number")
    private long productNumber;

    @Column(name = "name")
    private String name;

    @Column(name = "unit_price")
    private float unitPrice;

    @Column(name = "date_mfg")
    private Date dateMfd;


    public Long getPid() {
        return pid;
    }

    public Date getDateMfd() {
        return dateMfd;
    }

    public void setDateMfd(Date dateMfd) {
        this.dateMfd = dateMfd;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(long productNumber) {
        this.productNumber = productNumber;
    }

}