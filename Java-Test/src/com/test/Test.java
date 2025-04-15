package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    //This is Java,java is Programming language"

    public  static void main(String[] args){

        String word ="This is Java,java is Programming language";

        String word1 = word.replace(",", " ").toLowerCase();

        String[] wordCount = word1.split(" ");
        Map<String,Long> val= Arrays.stream(wordCount).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(val);

    }
}
