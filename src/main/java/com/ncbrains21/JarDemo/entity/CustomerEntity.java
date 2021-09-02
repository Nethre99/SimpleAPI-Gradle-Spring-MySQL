package com.ncbrains21.JarDemo.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "customer")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_ID")
    private int cusId;

    @Column(name = "name")
    private String custName;

    @Column(name = "phone")
    private int custTel;

    @Column(name = "email")
    private String cusEmail;

    @ManyToOne
    @JoinColumn(name = "address_ID")
    private AddressEntity address;

    @OneToMany(mappedBy = "customer")
    private Set recording = new HashSet<>();

    public CustomerEntity() {
        super();
    }

    public CustomerEntity(int cusId, String custName, int custTel, String cusEmail, AddressEntity address) {
        this.cusId = cusId;
        this.custName = custName;
        this.custTel = custTel;
        this.cusEmail = cusEmail;
        this.address = address;
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

    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" +
                "cusId=" + cusId +
                ", custName='" + custName + '\'' +
                ", custTel=" + custTel +
                ", cusEmail='" + cusEmail + '\'' +
                ", address=" + address +
                '}';
    }
}
