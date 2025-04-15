package com.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class futureThread {
    public static void  main(String args[]) throws ExecutionException, InterruptedException {
        System.out.println("Thread main     " + Thread.currentThread().getName());

        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2, 4, 10,
                TimeUnit.MINUTES, new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        //Use case 1 submit() with no return type
        Future<?> future = poolExecutor.submit(() -> {
            try {
                Thread.sleep(3000);
            }catch (Exception e){

            }
            System.out.println("thread to execute ");
        });

        System.out.println("thread to execute 1 : " + future.isDone());

        System.out.println("thread to execute 2 : " + future.get());

        System.out.println("thread to execute 3 : " + future.isCancelled());

        //Use case 2 submit() with  return type
        Object output =10;
        Future<Integer> future1 = poolExecutor.submit(() ->{
            System.out.println("thread to execute 2 ");
        }, (Integer) output);

        System.out.println("thread to execute 2 4 : " + future1.get());

    //Use case 3 submit() with callable
        Future<List<Integer>> future3 = poolExecutor.submit(() ->{
            List<Integer> list = new ArrayList<>();
            list.add(100);
            System.out.println("thread to execute 3 ");
            return list;
        });

        System.out.println("thread to execute 3 5 : " + future3.get());
    }

}
