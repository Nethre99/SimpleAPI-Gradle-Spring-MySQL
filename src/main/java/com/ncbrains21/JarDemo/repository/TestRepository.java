package com.ncbrains21.JarDemo.repository;

import com.ncbrains21.JarDemo.entity.TestClass;
import org.springframework.data.repository.CrudRepository;

public interface TestRepository extends CrudRepository<TestClass, Integer> {
}
