package com.thread.semaphore;


import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args){


        SharedResource sharedResource = new SharedResource();
        Thread th1 = new Thread(() ->{
            System.out.println("Thread th1 : " + Thread.currentThread().getName());
        sharedResource.produce();
        });


        Thread th2 = new Thread(() ->{
            System.out.println("Thread th2 : " + Thread.currentThread().getName());
            sharedResource.produce();
        });

        Thread th3 = new Thread(() ->{
            System.out.println("Thread th3 : " + Thread.currentThread().getName());
            sharedResource.produce();
        });

        Thread th4 = new Thread(() ->{
            System.out.println("Thread th4 : " + Thread.currentThread().getName());
            sharedResource.produce();
        });



    th1.start();
    th2.start();
    th3.start();
    th4.start();

}
}
