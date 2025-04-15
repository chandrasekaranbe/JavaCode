package com.thread.synchronize;




public class Main {

    public static void main(String[] args){

        SharedResource sharedResource = new SharedResource();
        Thread th1 = new Thread(() ->{
        sharedResource.produce();
        });

    SharedResource sharedResource1 = new SharedResource();
    Thread th2 = new Thread(() ->{
        sharedResource1.produce();
    });

    th1.start();
    th2.start();
}
}
