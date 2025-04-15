package com.test1;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RepChar {

    public  static void main(String[] args){
        String val="ChandraSekarjavaDeveloper";
        String val1 = val.trim().toLowerCase();
        Map<Character, Long> repchar = val1.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));

     Optional repchar1 = val1.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting())).entrySet().stream().filter(e -> e.getValue() >= 1).map(Map.Entry::getKey).findFirst();

        System.out.println(repchar);
        System.out.println(repchar1.get());

    }
}
