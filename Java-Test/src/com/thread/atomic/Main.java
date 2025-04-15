package com.thread.atomic;


public class Main {

    public static void main(String[] args){


        SharedResource sharedResource = new SharedResource();
        Thread th1 = new Thread(() ->{
            System.out.println("Thread th1 : " + Thread.currentThread().getName());
        sharedResource.increment();
        });


        Thread th2 = new Thread(() ->{
            System.out.println("Thread th2 : " + Thread.currentThread().getName());
            int val = sharedResource.get();
            System.out.println("Thread th2 val : " + val);
        });



    th1.start();
    th2.start();

}
}
