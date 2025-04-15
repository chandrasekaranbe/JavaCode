package com.test1;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class Test2 {

   /* public static void main(String[] args){

        String str = "aaabbccdefff";

        Map<Character, Long> charCount = str.chars()
                .mapToObj(c -> (char) c) // Convert to Character
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Count occurrences
                .entrySet().stream()
                .filter(e -> e.getValue() % 2 == 0) // Keep only even occurrences
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(charCount);


    }*/



    private final int id;
    private final String name;


    public Test2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
