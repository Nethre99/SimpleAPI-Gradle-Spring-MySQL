package com.ncbrains21.JarDemo.controller;

import com.ncbrains21.JarDemo.entity.TestClass;
import com.ncbrains21.JarDemo.service.TestServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/numbers")
public class TestController {

    @Autowired
    private TestServiceInterface testServiceInterface;

    @GetMapping("/allNumbers")
    public ResponseEntity<List<TestClass>> getAllNumbers(){
        List<TestClass> testClasses = null;

        try{
            testClasses = testServiceInterface.getAllNumbers();
        }catch (Exception ex){
            ex.getMessage();
        }

        return new ResponseEntity<List<TestClass>>(testClasses,HttpStatus.OK);
    }

}
