package com.thread;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource1 {
    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedResource1( int bufferSize) {
        sharedBuffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public  synchronized void produce(int item) throws Exception{

        System.out.println("SharedResource1 : sharedBuffer size  " + sharedBuffer.size());
        System.out.println("SharedResource1 : bufferSize size  " + bufferSize);
        while(sharedBuffer.size() == bufferSize){
            System.out.println("SharedResource1 : buffer is full , producer waiting for consumer");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("SharedResource1 : produce Thread Item " + item);
        System.out.println("SharedResource1 : produce sharedBuffer size  " +sharedBuffer.size());
        notify();

    }

    public  synchronized int consumer() throws Exception{

        while(sharedBuffer.isEmpty()){
            System.out.println("SharedResource1 : buffer is empty , consumer waiting for producer");
            wait();
        }
        int item = sharedBuffer.poll();
        System.out.println("SharedResource1 : consumer Thread  Item" + item);
        notify();
        return  item;
    }
}
