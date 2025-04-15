package com.thread.stampedlock;


import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {

    public static void main(String[] args){

       // ReadWriteLock lock = new ReentrantReadWriteLock();
        SharedResource sharedResource = new SharedResource();
        Thread th1 = new Thread(() ->{
            System.out.println("Thread th1 : " + Thread.currentThread().getName());
        sharedResource.produce();
        });


        Thread th2 = new Thread(() ->{
            System.out.println("Thread th2 : " + Thread.currentThread().getName());
            sharedResource.consume();
        });



    th1.start();
    th2.start();

}
}
