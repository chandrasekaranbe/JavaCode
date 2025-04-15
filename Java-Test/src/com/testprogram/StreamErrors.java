package com.test;

import java.util.*;
import java.util.stream.Collectors;

public class StreamErrors {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jake", "Jill", null, "James");

        // 1. Filter names starting with "J", convert to uppercase, and collect into a Set
        Set<String> result = names.stream().filter(Objects::nonNull)
                .filter( name -> name.startsWith("J"))
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

        System.out.println("Filtered Names: " + result);

        // 2. Find the first name after sorting alphabetically
        Optional<String> firstName = names.stream().filter(e -> e != null).sorted().findFirst();

        System.out.println("First Name: " + firstName.orElseThrow(() -> new RuntimeException("No names found")));

        // 3. Convert names to a Map with the name as the key and its length as the value
        Map<String, Integer> nameLengthMap = names.stream().filter(Objects::nonNull)
                .collect(Collectors.toMap(
                        name -> name,
                        name -> name.length()
                ));

        System.out.println("Name Length Map: " + nameLengthMap);
    }
}