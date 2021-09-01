package com.ncbrains21.JarDemo.service;

import com.ncbrains21.JarDemo.entity.CustomerEntity;

import java.util.List;

public interface CustomerServiceInterface {

    public List<CustomerEntity> getAllCustomers();
    public CustomerEntity addCustomer(CustomerEntity customerEntity);
    public CustomerEntity deleteCustomer(int ID);

}
