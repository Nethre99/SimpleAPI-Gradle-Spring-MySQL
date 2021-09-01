package com.ncbrains21.JarDemo.service.implementation;

import com.ncbrains21.JarDemo.entity.CustomerEntity;
import com.ncbrains21.JarDemo.repository.CustomerRepository;
import com.ncbrains21.JarDemo.service.CustomerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImplementation implements CustomerServiceInterface {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<CustomerEntity> getAllCustomers() {
        return (List<CustomerEntity>) customerRepository.findAll();
    }

    @Override
    public CustomerEntity addCustomer(CustomerEntity customerEntity) {
        return customerRepository.save(customerEntity);
    }

    @Override
    public CustomerEntity deleteCustomer(int ID) {
        CustomerEntity deleteCust = null;
        try {
            deleteCust = customerRepository.findById(ID).orElse(null);

            if (deleteCust == null){
                throw new Exception("Customer ID not found..!");
            }else{
                customerRepository.deleteById(ID);
            }
        }catch (Exception e){
            System.out.println("CustomerServiceImplementaion.deleteCustomer");
        }
        return deleteCust;
    }
}
