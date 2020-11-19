package com.effective.java.serialize;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ForkJoinPool.commonPool();
        String str;
        ExecutorService executorService = Executors.newCachedThreadPool();
//        executorService.invokeAll();
    }
}
