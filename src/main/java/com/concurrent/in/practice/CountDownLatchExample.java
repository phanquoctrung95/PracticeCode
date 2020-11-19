package com.concurrent.in.practice;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(2);


        try {

            WorkerEx1 workerEx1 = new WorkerEx1(countDownLatch);


            WorkerEx2 workerEx2 = new WorkerEx2(countDownLatch);
            workerEx1.run();
            countDownLatch.await();
            workerEx2.run();

            System.out.println("All resources had been prepared");

        } catch (InterruptedException e) {
            System.out.println("exception " + e);
            Thread.currentThread().interrupt();
        }
    }

}
