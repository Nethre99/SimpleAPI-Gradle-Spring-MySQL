package com.ncbrains21.JarDemo.service.implementation;

import com.ncbrains21.JarDemo.entity.TestClass;
import com.ncbrains21.JarDemo.repository.TestRepository;
import com.ncbrains21.JarDemo.service.TestServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImplementation implements TestServiceInterface {

    @Autowired
    private TestRepository testRepository;

    @Override
    public List<TestClass> getAllNumbers() {
        return (List<TestClass>) testRepository.findAll();
    }

    @Override
    public TestClass getNumberfrstCOL(int col) {
        return testRepository.findById(col).orElse(null);
    }

    @Override
    public TestClass updateUser(TestClass testNumberClass) {
        return testRepository.save(testNumberClass);
    }

    @Override
    public TestClass deleteNumber(int col1) {

        TestClass delTestClass = null;
        try {
            delTestClass = testRepository.findById(col1).orElse(null);

            if (delTestClass == null){
                throw new Exception("Test Number not found");
            }else {
                testRepository.deleteById(col1);
            }

        }catch (Exception e){
            System.out.println("TestServiceImplementation.java");
        }

        return delTestClass;
    }
}
