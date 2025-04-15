package com.Test2;

import java.util.*;
import java.util.stream.Collectors;



public class SecondHighestNumber {
    public static void main(String[] args){
        int[] val={10,40,60,89,90,130};
        Optional<Integer> val2nd =  Arrays.stream(val).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(val2nd.get());


        Map<String, Integer> map = new HashMap<>();
        map.put("Abrar", 30000);
        map.put("Chand", 80000);
        map.put("kalam", 70000);
        map.put("Raheem", 25000);
        map.put("Kiran", 63000);
        map.put("Esa", 45000);
        int n =2;

        Map.Entry<String, Integer> value = map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList())
                .get(n-1);
        System.out.println(value);

        Map.Entry<Integer,List<String>> nthHigestMap= map.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey,Collectors.toList())))
                .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).get(n-1);
        System.out.println(nthHigestMap);
    }
}
