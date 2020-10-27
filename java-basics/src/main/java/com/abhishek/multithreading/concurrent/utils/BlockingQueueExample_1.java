package com.abhishek.multithreading.concurrent.utils;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample_1 {

    public static void main(String args[]) {
        BlockingQueue queue=new ArrayBlockingQueue(10);
        Producer producer=new Producer(queue);
        Consumer consumer=new Consumer(queue);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

class Producer implements Runnable {

    private BlockingQueue queue;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i <=50; i++) {
            System.out.println("Produced item "+i);
            try {
                queue.put("item "+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {

    private BlockingQueue queue;

    public Consumer(BlockingQueue queue) {
        this.queue=queue;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(20000);
                System.out.println("Consumed "+queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}