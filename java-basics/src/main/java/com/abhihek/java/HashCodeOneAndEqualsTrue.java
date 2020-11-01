package com.abhihek.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeOneAndEqualsTrue {

    public static void main(String[] args) {
        Map<Employee, Object> testMap1 = new HashMap<>();

        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("Name 1");

        Employee e2 = new Employee();
        e2.setId(2);
        e2.setName("Name 2");

        Employee e3 = new Employee();
        e3.setId(3);
        e3.setName("Name 3");

        testMap1.put(e1, "test1");
        testMap1.put(e2, "test2");
        testMap1.put(e3, "test3");

        System.out.println(testMap1);

    }
}

class Employee {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}