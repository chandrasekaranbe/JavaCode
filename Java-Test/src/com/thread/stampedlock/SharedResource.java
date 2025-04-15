package com.thread.stampedlock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.StampedLock;

public class SharedResource {

    int  a=10;
    StampedLock lock = new StampedLock();

    public void produce(){

        long stamp =  lock.tryOptimisticRead();
        try {

            System.out.println("taken optimistic read " );
            a =11;
            Thread.sleep(6000);
            System.out.println("stamp : " + stamp);

            if(lock.validate(stamp)){
                System.out.println("update value successfully " );
            }else {
                System.out.println("rollback to work " );
                a =10; //rollback
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void consume(){
        long stamp =lock.writeLock();
        System.out.println("Write Lock acquired by: " + Thread.currentThread().getName());
        try {

            System.out.println("performing work");
            a=9;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlockWrite(stamp);
            System.out.println("Write Lock release by: " + Thread.currentThread().getName());
        }
    }
}
