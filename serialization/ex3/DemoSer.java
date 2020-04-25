package com.abhishek.serialization.hasa;

import java.io.Serializable;

public class DemoSer implements Serializable {

    private static final long serialVersionUID = 8921236421241571165L;
    private String ename;
    private int age;
    private DemoSerHasa demoSerHasa;

    public DemoSer(String ename, int age, DemoSerHasa demoSerHasa) {
        this.ename = ename;
        this.age = age;
        this.demoSerHasa = demoSerHasa;
    }
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DemoSerHasa getDemoSerHasa() {
        return demoSerHasa;
    }

    public void setDemoSerHasa(DemoSerHasa demoSerHasa) {
        this.demoSerHasa = demoSerHasa;
    }
}
