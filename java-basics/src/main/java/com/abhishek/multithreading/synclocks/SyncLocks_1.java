package com.abhishek.multithreading.synclocks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SyncLocks_1 {

    public static void main(String[] args) {

        Counter cc= new Counter();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        /*IntStream.range(0, 100)
                .forEach(i -> executor.submit(new Thread(new Runner(cc))));*/
        for (int i =0; i<=100;i++) {
            Runner rr= new Runner(cc);
            executor.submit(rr);
        }
        executor.shutdown();
        System.out.println(cc.count.intValue());
    }
}

class Runner implements Runnable {
    Counter counter;
    public Runner(Counter counter) {
        this.counter = counter;
    }
    @Override
    public void run() {
        counter.incrementCount();
    }
}

class Counter {
    AtomicInteger count = new AtomicInteger(0);
    public synchronized void incrementCount() {
        System.out.println(count.intValue());
        count.getAndIncrement();
    }
}
