package com.ncbrains21.JarDemo.entity;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class CustomerEntity {

    @Id
    @GeneratedValue
    @Column(name = "customer_ID")
    private int cusId;

    @Column(name = "name")
    private String custName;

    @Column(name = "phone")
    private int custTel;

    @Column(name = "email")
    private String cusEmail;

    public CustomerEntity() {
        super();
    }

    public CustomerEntity(int cusId, String custName, int custTel, String cusEmail) {
        this.cusId = cusId;
        this.custName = custName;
        this.custTel = custTel;
        this.cusEmail = cusEmail;
    }

    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public int getCustTel() {
        return custTel;
    }

    public void setCustTel(int custTel) {
        this.custTel = custTel;
    }

    public String getCusEmail() {
        return cusEmail;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" +
                "cusId=" + cusId +
                ", custName='" + custName + '\'' +
                ", custTel=" + custTel +
                ", cusEmail='" + cusEmail + '\'' +
                '}';
    }
}
