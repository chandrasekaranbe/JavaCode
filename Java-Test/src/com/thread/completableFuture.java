package com.thread;

import java.util.concurrent.*;

public class completableFuture {

    public static void  main(String args[]) throws ExecutionException, InterruptedException {
        System.out.println("Thread completableFuture     " + Thread.currentThread().getName());

        try {

            ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2, 4, 10,
                    TimeUnit.MINUTES, new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

//            CompletableFuture<String> obj = CompletableFuture.supplyAsync(() -> {
//                System.out.println("thread to execute 1");
//                return "task completed";
//            }, poolExecutor);

//            CompletableFuture<String> obj = CompletableFuture.supplyAsync(() -> {
//                return "task completed";
//            }, poolExecutor).thenCompose((String val) -> {
//                return CompletableFuture.supplyAsync(() -> val + " successfully");
//            });

//            CompletableFuture<String> obj = CompletableFuture.supplyAsync(() -> {
//                return "task completed";
//            }, poolExecutor).thenComposeAsync((String val) -> {
//                return CompletableFuture.supplyAsync(() -> val + " successfully");
//            }).thenComposeAsync((String val) -> {
//                return CompletableFuture.supplyAsync(() -> val + " successfully");
//            });

            CompletableFuture<String> obj = CompletableFuture.supplyAsync(() -> {
                return "task completed";
            }, poolExecutor).thenComposeAsync((String val) -> {
                return CompletableFuture.supplyAsync(() -> val + " successfully");
            }).thenComposeAsync((String val) -> {
                return CompletableFuture.supplyAsync(() -> val + " successfully");
            });



            System.out.println("thread to execute 2 " + obj.get());
        } catch (Exception e) {
            e.getMessage();
        }



    }
}
