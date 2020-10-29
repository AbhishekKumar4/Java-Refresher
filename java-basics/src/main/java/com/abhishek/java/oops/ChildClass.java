package com.abhishek.java.oops;

import java.io.FileNotFoundException;

class Parent {
    public void display() throws ClassNotFoundException {
        System.out.println("Hello from Parent");
    }
}

public class ChildClass extends Parent {

    public void display() {
        System.out.println("Hello from Child");
    }
    public static void main(String[] args) {
        ChildClass cc= new ChildClass();
        Parent parent = new ChildClass();
        cc.display();;

    }
}
