package com.abhishek.multhreading.executors;

import java.util.concurrent.*;

public class Practice2 {

    public static void main(String[] args) {

        Callable callable = () -> {
            System.out.println("hello from callable!!!");
            //Thread.sleep(2000);
            return 1;
        };

        ExecutorService service = Executors.newSingleThreadExecutor();
        Future future = service.submit(callable);

        System.out.println("Finishing!!! ");

        try {
            service.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(future.isDone());
        service.shutdown();
    }
}
