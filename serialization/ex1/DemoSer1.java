package com.abhishek.serializable;

import java.io.Serializable;

public class DemoSer1 implements Serializable {

    private static final long serialVersionUID = 8929136421241571165L;
    public String ename;
    public int age;

    public DemoSer1(String ename, int age) {
        this.ename = ename;
        this.age = age;
    }
}
