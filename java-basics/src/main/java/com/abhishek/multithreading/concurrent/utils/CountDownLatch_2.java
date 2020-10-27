package com.abhishek.multithreading.concurrent.utils;

import java.util.concurrent.CountDownLatch;

public class CountDownLatch_2 {

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(4);

        Worker first = new Worker(latch, 1000);
        Worker second = new Worker(latch, 2000);
        Worker third = new Worker(latch, 3000);
        Worker fourth = new Worker(latch, 4000);

        first.start();
        second.start();
        third.start();
        fourth.start();

        // The main task waits for four threads
        latch.await();

        // Main thread has started
        System.out.println(Thread.currentThread().getName() +
                " has finished");
    }
}

class Worker extends Thread {

    private CountDownLatch countDownLatch;
    private int delay;
    public Worker(CountDownLatch countDownLatch, int delay) {
        this.countDownLatch = countDownLatch;
        this.delay = delay;
    }
    @Override
    public void run() {
        try
        {
            Thread.sleep(delay);
            countDownLatch.countDown();
            System.out.println(Thread.currentThread().getName()
                    + " finished");
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
