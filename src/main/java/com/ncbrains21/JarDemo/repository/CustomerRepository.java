package com.ncbrains21.JarDemo.repository;

import com.ncbrains21.JarDemo.entity.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<CustomerEntity,Integer> {
}
