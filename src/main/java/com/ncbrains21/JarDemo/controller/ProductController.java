package com.ncbrains21.JarDemo.controller;

import com.ncbrains21.JarDemo.entity.ProductEntity;
import com.ncbrains21.JarDemo.service.ProductServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/v1/Product")
public class ProductController {

    @Autowired
    private ProductServiceInterface productServiceInterface;

    @GetMapping("/prod_category")
    @ResponseBody
    public ResponseEntity<List<ProductEntity>>getProductByCategories(@RequestParam(required = false) String reqCategory){
        List<ProductEntity> requestList = null;

        try{

            requestList = productServiceInterface.getProductByCategories(reqCategory);

        }catch (Exception e) {
            e.getMessage();
        }

        return new ResponseEntity<List<ProductEntity>>(requestList, HttpStatus.OK);
    }

    @GetMapping("/prod_id")
    @ResponseBody
    public ResponseEntity<ProductEntity> getProductById(@RequestParam(required = false) int prodID){
        ProductEntity product = null;
        product = productServiceInterface.getProdById(prodID);
        return new ResponseEntity<ProductEntity>(product, HttpStatus.OK);
    }

}
