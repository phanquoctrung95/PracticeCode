package com.concurrent.in.practice.pool.example;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinPoolExample {
    public static void main(String[] args) {
        String workload="phan quoc trung phan quoc trung phan quoc trung phan quoc trung";
        ForkJoinPool forkJoinPool = new ForkJoinPool(10);
        CustomRecursiveAction customRecursiveAction = new CustomRecursiveAction(workload);
        CustomRecursiveTask customRecursiveTask =new CustomRecursiveTask(new int[]{1, 3, 2, 32, 32321, 3213, 23});
        forkJoinPool.invoke(customRecursiveAction);
        System.out.println(forkJoinPool.invoke(customRecursiveTask));
        
//        customRecursiveAction.join();
//        System.out.println(customRecursiveTask.join());
    }
}
