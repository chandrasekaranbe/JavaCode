package com.Test1;

import java.util.ArrayList;
import java.util.List;

public class EnumMain {
    public  static void main(String[] args){
        for(EnumSample enumSample : EnumSample.values()){
            System.out.println(enumSample.ordinal());
        }

        EnumSample sample = EnumSample.valueOf("SUNDAY");
        System.out.println(sample.name());
        System.out.println(EnumSample.FRIDAY);


        List<String> list = new ArrayList<>();
        list.add("Chandra1");
        list.add("Chandra2");
        Immutable immutable = new Immutable("Test", list);
        System.out.println(immutable.getName());
        System.out.println(immutable.getPetnameList());
        immutable.getPetnameList().add("Chandra3");
        System.out.println(immutable.getPetnameList());
    }
}
