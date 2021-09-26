package com.ncbrains21.JarDemo.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "address")
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_ID")
    private int addressId;

    @Column(name = "zip_code")
    private int zipCode;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @OneToMany(mappedBy = "address")
    private List<CustomerEntity> customerEntityList;

    public AddressEntity(int addressId, int zipCode, String street, String city, String state) {
        this.addressId = addressId;
        this.zipCode = zipCode;
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public AddressEntity() {

    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

