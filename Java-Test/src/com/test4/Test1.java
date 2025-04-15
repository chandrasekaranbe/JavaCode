package com.test4;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

    public  static void main(String[] args) {
        String[] str = {"I", "AM", "LONGEST", "WORD"};

        Map<Integer, List<String>> count= Arrays.asList(str).stream().
                collect(Collectors.groupingBy(String::length,
                        () -> new TreeMap<>(Collections.reverseOrder()),
                        Collectors.toList()));

        count.forEach((num, words) -> words.forEach(word -> System.out.println( num +":::" +word.toString())));


                System.out.println(count);

        Arrays.stream(str)
                .sorted(Comparator.comparingInt(String::length).reversed()) // Sort by length in descending order
                .forEach(word -> System.out.println(word.length() + " : " + word + "\n"));
    }
//String[] str = {"I", "AM", "LONGEST", "WORD"};
//    O/P:
//            7 : LONGEST
//
//4 : WORD
//
//2 : AM
//
//1 : I


}
