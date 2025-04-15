package com.test;

import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FindNthElements {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        //2nd highest number from map
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
        System.out.println("2nd highest number from map  " +value.getKey() +":"+ value.getValue());

        //2nd highest number from list
        List<Integer> numbers = Arrays.asList(10, 20, 35, 50, 50, 75, 65);
        Optional<Integer> secHighest = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println("2nd highest number from List   " + secHighest.get());

        List<Integer> listval = numbers.stream().map(e -> e + 5).collect(Collectors.toList());
        System.out.println("listval   " + listval);

        Map<String, Integer> mapVal = new HashMap<>();
        mapVal.put("Abrar", 30000);
        mapVal.put("Chand", 80000);
        mapVal.put("kalam", 70000);
        mapVal.put("seka", 70000);
        mapVal.put("Raheem", 25000);
        mapVal.put("Kiran", 63000);
        mapVal.put("Esa", 45000);

        Map.Entry<Integer,List<String>> nthHigestMap= mapVal.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey,Collectors.toList())))
                .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList())
                .get(n-1);


        System.out.println(nthHigestMap);

        //Write a single statement using java to fetch 3 highest elements from an unsorted array.
        int[] arr = {12, 5, 8, 19, 25, 3, 17};
        int[] top3 = Arrays.stream(arr)
                .boxed()          // Convert int to Integer
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .limit(3)         // Get top 3 elements
                .mapToInt(Integer::intValue) // Convert back to int
                .toArray();

        System.out.println(Arrays.toString(top3));


    }


}