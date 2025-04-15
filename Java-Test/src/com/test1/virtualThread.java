package com.test1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class virtualThread {

    public static void main(String[] args){

        int a = 10;
        int b = 5;
        int c = a + b * 10;
        System.out.println(c);
        Thread thread= Thread.ofVirtual().start(() ->{

                System.out.println("new virtual thread: " + Thread.currentThread());

        });

       ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor(); {
            for (int i = 1; i <= 1_000_0; i++) {
                int taskId = i;
                executor.submit(() -> System.out.println("Task " + taskId + " running in " + Thread.currentThread()));
            }
        }

        }
}
