package com.thread.reentrant;


import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args){

        ReentrantLock lock = new ReentrantLock();
        SharedResource sharedResource = new SharedResource();
        Thread th1 = new Thread(() ->{
            System.out.println("Thread th1 : " + Thread.currentThread().getName());
        sharedResource.produce(lock);
        });

    SharedResource sharedResource1 = new SharedResource();
    Thread th2 = new Thread(() ->{
        System.out.println("Thread th2 : " + Thread.currentThread().getName());
        sharedResource1.produce(lock);
    });

    th1.start();
    th2.start();
}
}
