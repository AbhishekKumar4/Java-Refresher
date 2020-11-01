package com.abhishek.multhreading.executors;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Practice1 {

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();

        service.submit(() -> {
            for(int i=0; i<=5;i++) {
                System.out.println("task 1");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        service.submit(() -> {
            for(int i=0; i<=5;i++) {
                System.out.println("task2");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        service.shutdown();
    }
}
