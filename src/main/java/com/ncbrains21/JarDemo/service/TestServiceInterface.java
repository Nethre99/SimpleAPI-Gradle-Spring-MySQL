package com.ncbrains21.JarDemo.service;

import com.ncbrains21.JarDemo.entity.TestClass;


import java.util.List;

public interface TestServiceInterface {

    public List<TestClass> getAllNumbers();
    public TestClass getNumberfrstCOL(int col);
    public TestClass updateUser(TestClass testNumberClass);
    public TestClass deleteNumber(int col1);

}
