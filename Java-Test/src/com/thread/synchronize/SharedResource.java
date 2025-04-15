package com.thread.synchronize;

public class SharedResource {

    boolean isAvailable=false;

    public synchronized  void produce(){
        try {
            System.out.println("Lock acquired by: " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Lock release by: " + Thread.currentThread().getName());
    }
}
