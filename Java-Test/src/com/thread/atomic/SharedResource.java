package com.thread.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedResource {

    AtomicInteger counter = new AtomicInteger(1);

    public void increment(){
        counter.incrementAndGet();
    }

    public int get(){
        return counter.get();
    }

}
