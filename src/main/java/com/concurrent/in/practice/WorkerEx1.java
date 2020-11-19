package com.concurrent.in.practice;

import java.util.concurrent.CountDownLatch;

public class WorkerEx1 implements Runnable {
    private CountDownLatch countDownLatch;
    private static final int delay = 200;

    public WorkerEx1(CountDownLatch countDownLatch) {

        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {

        System.out.println("Prepare resources of " + WorkerEx1.class);
        try {
            Thread.sleep(delay);
            countDownLatch.countDown();
        } catch (InterruptedException e) {
            System.out.println("exception: " + e);
            Thread.currentThread().interrupt();
        }
    }
}
