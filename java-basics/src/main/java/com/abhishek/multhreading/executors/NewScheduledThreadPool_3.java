package com.abhishek.multhreading.executors;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class NewScheduledThreadPool_3 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Current Time = "+new Date());
        // Created ScheduledThreadPoolExecutor object
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(3);
        for(int i=1; i<=3; i++){
            Thread.sleep(2000);
            RunnableTask task = new RunnableTask("Task "+i);
            scheduledThreadPool.schedule(task,5, TimeUnit.SECONDS);
        }
        // Adding some delay
        Thread.sleep(10000);

        scheduledThreadPool.shutdown();
        System.out.println("Completed all threads");
    }
}

class RunnableTask implements Runnable{

    private String taskName;

    public RunnableTask(String s){
        this.taskName=s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Start Time for "+taskName+" "+new Date());
        // Process task here
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" End Time for "+taskName+" "+new Date());
    }

    @Override
    public String toString(){
        return this.taskName;
    }
}
