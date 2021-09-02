package com.ncbrains21.JarDemo.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_id")
    private int productID;

    @Column(name = "num_stocks")
    private int productStock;

    @Column(name = "price")
    private int productPrice;

    @Column(name = "prod_name")
    private String productName;

    @OneToMany(mappedBy = "product")
    private Set recording = new HashSet<>();

    public ProductEntity() {
    }

    public ProductEntity(int productID, int productStock, int productPrice, String productName) {
        this.productID = productID;
        this.productStock = productStock;
        this.productPrice = productPrice;
        this.productName = productName;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "productID=" + productID +
                ", productStock=" + productStock +
                ", productPrice=" + productPrice +
                ", productName='" + productName + '\'' +
                ", recording=" + recording +
                '}';
    }
}
