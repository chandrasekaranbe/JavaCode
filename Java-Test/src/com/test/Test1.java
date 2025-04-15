package com.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test1 {

    public static void main(String[] args) {
        // 3 list of integer
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(3,4,5);
        List<Integer> list3 = Arrays.asList(3,2,1);

        Set<Integer> set = new HashSet<>();

        for(Integer l1 : list1){
            if(list2.contains(l1)  && list3.contains(l1)){
                set.add(l1);
            }

        }
        System.out.println(set);
    }
}
