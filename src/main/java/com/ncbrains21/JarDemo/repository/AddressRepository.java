package com.ncbrains21.JarDemo.repository;

import com.ncbrains21.JarDemo.entity.AddressEntity;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<AddressEntity, Integer> {
}
