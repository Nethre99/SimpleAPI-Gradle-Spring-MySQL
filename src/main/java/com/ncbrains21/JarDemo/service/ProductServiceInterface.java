package com.ncbrains21.JarDemo.service;

import com.ncbrains21.JarDemo.entity.ProductEntity;

import java.util.List;

public interface ProductServiceInterface {
    public List<ProductEntity> getAllProducts();
    public List<ProductEntity> getProductByCategories (String categories);
    public ProductEntity getProdById(int id);
}
