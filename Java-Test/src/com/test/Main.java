package com.test;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static <Char> void main(String[] args) {

    String tes ="chandra";
    Set<Character> set = new HashSet<>();
    for(char cha: tes.toCharArray()){
        if(set.contains(cha)){
            System.out.println(cha);
        }else {
            set.add(cha);
        }

    }
        System.out.println(set.stream().sorted().collect(Collectors.toSet()));

        List<String> dupli = Arrays.asList("AA","BB","CC","AA");

        String input = "Alice:1, Bob:2, Charlie:3";

       Map<String,Long> val1 = dupli.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Set<String> val = dupli.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                        .entrySet().stream().filter(e -> e.getValue() > 1)
        .map(Map.Entry::getKey).collect(Collectors.toSet());

        System.out.println(val1);
        System.out.println(val);
        List<Integer> nd= Arrays.asList(1, 3, 5, 7, 9);
        Optional<Integer> _2nd = nd.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst();

        System.out.println(_2nd);



        Map<String,Integer> conStrtoMap = Arrays.stream(input.split(", ")).map(e -> e.split(":"))
                .collect(Collectors.toMap(a -> a[0],a -> Integer.parseInt(a[1])));

        System.out.println(conStrtoMap);
    }
}