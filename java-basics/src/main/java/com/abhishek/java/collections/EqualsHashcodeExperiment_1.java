package com.abhishek.java.collections;

import java.util.HashSet;
import java.util.Objects;

public class EqualsHashcodeExperiment_1 {


    public static void main(String[] args) {
        Employee e1 = new Employee(1, "test");
        Employee e2 = new Employee(1, "test2");


        HashSet set = new HashSet<>();
        set.add(e1);
        set.add(e2);

        System.out.println(set);

    }
}

class Employee {

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id =id;
        this.name=name;
    }

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
        if(this == o){
            return true;
        }
        if(o == null) {
            return false;
        }
        if(getClass() != o.getClass()) {
            return false;
        }
        return (getId() == ((Employee)o).getId());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
