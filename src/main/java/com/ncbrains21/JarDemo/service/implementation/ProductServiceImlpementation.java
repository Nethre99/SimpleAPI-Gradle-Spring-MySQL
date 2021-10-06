package com.ncbrains21.JarDemo.service.implementation;

import com.ncbrains21.JarDemo.entity.ProductEntity;
import com.ncbrains21.JarDemo.repository.ProductRepository;
import com.ncbrains21.JarDemo.service.ProductServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImlpementation implements ProductServiceInterface {

    @Autowired
    private ProductRepository prodRepo;

    @Override
    public List<ProductEntity> getAllProducts() {
        return (List<ProductEntity>) prodRepo.findAll();
    }

    @Override
    public List<ProductEntity> getProductByCategories (String categories) {

        List<ProductEntity> catProduct = new ArrayList<>();

        for (ProductEntity product : getAllProducts()) {
            System.out.println(product);
            if (product.getCatgory().equalsIgnoreCase(categories)) {
                System.out.println(product);
                catProduct.add(product);
            }
        }
        return catProduct;
    }

    @Override
    public ProductEntity getProdById(int id) {
        return prodRepo.findById(id).orElse(null);
    }
}
