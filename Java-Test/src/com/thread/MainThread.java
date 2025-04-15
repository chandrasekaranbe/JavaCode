package com.thread;

public class MainThread {

    public static void main(String[] args){

        SharedResource sharedResourceObj =new SharedResource();
        SharedResource1 sharedResource1 = new SharedResource1(3);

        Thread producerThread = new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("producerThread");
            }catch (Exception e){
                e.printStackTrace();
            }
            sharedResourceObj.addItem();
        });

        Thread consumerThread = new Thread(() -> {
            System.out.println("consumerThread");
            sharedResourceObj.consumeItem();
        });

       // producerThread.start();
        //consumerThread.start();


        Thread producerThread1 = new Thread(() -> {
            try {
                for (int i = 1; i <= 8 ; i++) {
                    //System.out.println("producerThread1");
                    sharedResource1.produce(i);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        });

        Thread consumerThread1 = new Thread(() -> {
            try {
                for (int i = 1; i <= 8 ; i++) {
                    //System.out.println("consumerThread1");
                    sharedResource1.consumer();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        });

        producerThread1.start();
        consumerThread1.start();
    }
}
