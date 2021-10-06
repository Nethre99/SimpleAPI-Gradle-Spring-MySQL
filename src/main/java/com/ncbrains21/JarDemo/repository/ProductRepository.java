package com.ncbrains21.JarDemo.repository;

import com.ncbrains21.JarDemo.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntity, Integer> {
}
