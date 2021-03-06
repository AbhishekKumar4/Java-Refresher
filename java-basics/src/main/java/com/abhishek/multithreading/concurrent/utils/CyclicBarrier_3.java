package com.abhishek.multithreading.concurrent.utils;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrier_3 {

    public static void main(String[] args) {

        CyclicBarrier cyclicBarrier=new CyclicBarrier(3 ,new CyclicBarrierFinishEvent());

        RunnableTask runnableTask1=new RunnableTask(cyclicBarrier,1000);
        RunnableTask runnableTask2=new RunnableTask(cyclicBarrier,2000);
        RunnableTask runnableTask3=new RunnableTask(cyclicBarrier,3000);


        //Create and start 3 threads
        new Thread(runnableTask1,"Thread-1").start();
        new Thread(runnableTask2,"Thread-2").start();
        new Thread(runnableTask3,"Thread-3").start();

        /*
         * We are reusing cyclic barrier using below threads
         * */
        RunnableTask runnableTask4=new RunnableTask(cyclicBarrier,4000);
        RunnableTask runnableTask5=new RunnableTask(cyclicBarrier,5000);
        RunnableTask runnableTask6=new RunnableTask(cyclicBarrier,6000);

        // Create and start 3 more threads
        new Thread(runnableTask4,"Thread-4").start();
        new Thread(runnableTask5,"Thread-5").start();
        new Thread(runnableTask6,"Thread-6").start();

    }
}

class CyclicBarrierFinishEvent implements Runnable{

    public void run() {

        System.out.println("As 3 threads have reached common barrier point "
                + ", CyclicBarrrierFinishEvent has been triggered");
        System.out.println("You can update shared variables if any");
    }

}

class RunnableTask implements Runnable{

    CyclicBarrier cyclicBarrier;
    long sleepTime;

    RunnableTask(CyclicBarrier cyclicBarrier,long sleepTime){
        this.cyclicBarrier=cyclicBarrier;
        this.sleepTime=sleepTime;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(sleepTime);
            System.out.println(Thread.currentThread().getName() +
                    " is waiting for "+(cyclicBarrier.getParties()-cyclicBarrier.getNumberWaiting()-1)+
                    " other threads to reach common barrier point");
            /*
             * when  3 parties will call await() method (i.e. common barrier point)
             * CyclicBarrrierEvent will be triggered and all waiting threads will be released.
             */
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

        System.out.println("As "+cyclicBarrier.getParties()+ " threads have reached common barrier point "
                + Thread.currentThread().getName() +
                " has been released");
    }

}
