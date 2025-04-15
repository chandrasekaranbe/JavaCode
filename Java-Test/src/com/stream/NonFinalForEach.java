package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class NonFinalForEach {
    public  static void  main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
         // work around
        AtomicInteger atomicInteger = new AtomicInteger(0);
        list.forEach(n -> atomicInteger.addAndGet(n));
        System.out.println(atomicInteger.get());

        //non final using lambda in stream
//        int sum=0;
//        try {
//            list.forEach(n -> sum += n);
//            System.out.println(sum);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }
}
