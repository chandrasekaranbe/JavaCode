package com.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

public class ForkJoinPoolT1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        Future<String> future = forkJoinPool.submit(() ->{
            System.out.println("fork join pool");
            return "Fork";
        });
        System.out.println("fork join pool" + future.get());
    }
}
