package com.ncbrains21.JarDemo.repository;

import com.ncbrains21.JarDemo.entity.OrderEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderEntity, Integer> {
}
