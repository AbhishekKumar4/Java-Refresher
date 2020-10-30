package com.abhishek.multhreading.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SyncLocks_2 {

        public static void main(String[] args) {

        Counter1 cc= new Counter1();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        /*IntStream.range(0, 100)
                .forEach(i -> executor.submit(new Thread(new Runner(cc))));*/
        for (int i =0; i<=100;i++) {
            Runner1 rr= new Runner1(cc);
            executor.submit(rr);
        }
        executor.shutdown();
        System.out.println(cc.count);
    }
}

    class Runner1 implements Runnable {
        Counter1 counter;
        public Runner1(Counter1 counter) {
            this.counter = counter;
        }
        @Override
        public void run() {
            counter.incrementCount();
        }
    }

    class Counter1 {
        volatile int count = 0;
        public synchronized void incrementCount() {
            count = count + 1;
        }
    }

