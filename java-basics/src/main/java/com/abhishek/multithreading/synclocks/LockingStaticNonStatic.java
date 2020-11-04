package com.abhishek.multithreading.synclocks;

public class LockingStaticNonStatic {

    public static void main(String[] args) {
        TestClass testClass = new TestClass();

        MyThread1 t1 = new MyThread1(testClass);
        MyThread2 t2 = new MyThread2(testClass);

        t1.start();
        t2.start();
    }
}

class TestClass {
    public void method1() {
        synchronized (TestClass.class) {
            System.out.println("Hello method1, I am :  " + Thread.currentThread().getName());
            try {
                Thread.currentThread().sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void method2() {
        synchronized (this) {
            System.out.println("Hello method2, I am :  " + Thread.currentThread().getName());
            try {
                Thread.currentThread().sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread1 extends Thread {
    TestClass testClass;
    public MyThread1(TestClass testClass) {
        this.testClass = testClass;
    }
    @Override
    public void run() {
        testClass.method1();
    }
}

class MyThread2 extends Thread {
    TestClass testClass;
    public MyThread2(TestClass testClass) {
        this.testClass = testClass;
    }
    @Override
    public void run() {
        testClass.method2();
    }
}

