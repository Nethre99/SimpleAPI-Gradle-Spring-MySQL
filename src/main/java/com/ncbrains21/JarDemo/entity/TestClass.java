package com.ncbrains21.JarDemo.entity;

import javax.persistence.*;

@Entity
@Table(name = "testtab1")
public class TestClass {

    @Id
    @GeneratedValue
    @Column(name = "abc")
    private int col1;

    @Column(name = "efg")
    private int col2;

    @Column(name = "hij")
    private int col3;

    @Column(name = "klm")
    private int col4;

    public TestClass() {
        super();
    }

    public TestClass(int col1, int col2, int col3, int col4) {
        this.col1 = col1;
        this.col2 = col2;
        this.col3 = col3;
        this.col4 = col4;
    }

    public int getCol1() {
        return col1;
    }

    public void setCol1(int col1) {
        this.col1 = col1;
    }

    public int getCol2() {
        return col2;
    }

    public void setCol2(int col2) {
        this.col2 = col2;
    }

    public int getCol3() {
        return col3;
    }

    public void setCol3(int col3) {
        this.col3 = col3;
    }

    public int getCol4() {
        return col4;
    }

    public void setCol4(int col4) {
        this.col4 = col4;
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "col1=" + col1 +
                ", col2=" + col2 +
                ", col3=" + col3 +
                ", col4=" + col4 +
                '}';
    }
}
