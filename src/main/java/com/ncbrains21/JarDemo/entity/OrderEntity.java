package com.ncbrains21.JarDemo.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue
    @Column(name = "order_ID")
    private int orderID;

    @Column(name = "date")
    private Date orderedDate;

    @ManyToOne
    @JoinColumn(name = "customer_ID")
    private CustomerEntity customer;

    public OrderEntity() {
    }

    public OrderEntity(int orderID, Date orderedDate, CustomerEntity customer) {
        this.orderID = orderID;
        this.orderedDate = orderedDate;
        this.customer = customer;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Date getOrderedDate() {
        return orderedDate;
    }

    public void setOrderedDate(Date orderedDate) {
        this.orderedDate = orderedDate;
    }

    public CustomerEntity getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerEntity customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "OrderEntity{" +
                "orderID=" + orderID +
                ", orderedDate=" + orderedDate +
                ", customer=" + customer +
                '}';
    }
}
