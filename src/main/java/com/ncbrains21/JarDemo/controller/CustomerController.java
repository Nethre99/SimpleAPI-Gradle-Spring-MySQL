package com.ncbrains21.JarDemo.controller;

import com.ncbrains21.JarDemo.entity.CustomerEntity;
import com.ncbrains21.JarDemo.service.CustomerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerServiceInterface customerServiceInterface;

    @GetMapping("/allCustomers")
    public ResponseEntity<List<CustomerEntity>> getAllCustomers(){
        List<CustomerEntity> customerEntityList = null;

        try{
            customerEntityList = customerServiceInterface.getAllCustomers();

        }catch(Exception e){
            e.getMessage();
        }

        return new ResponseEntity<List<CustomerEntity>>(customerEntityList, HttpStatus.OK);
    }

    @PostMapping("/addCustomer")
    public ResponseEntity<CustomerEntity> setNewCustomer(@RequestBody CustomerEntity customer){
        CustomerEntity customer1 = null;

        try{
            customer1 = customerServiceInterface.addCustomer(customer);

        }catch(Exception e){
            e.getMessage();
        }

        return new ResponseEntity<CustomerEntity>(customer1, HttpStatus.OK);
    }


}
