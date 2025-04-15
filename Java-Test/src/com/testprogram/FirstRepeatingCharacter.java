package com.test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatingCharacter {
    public static void main(String[] args) {
        String input = "swiss";

        // Find first repeating character using Java Streams
        Character firstRepeat = input.chars()
                .mapToObj(c -> (char) c)  // Convert int stream to Character stream
                .collect(Collectors.toMap(c -> c, c -> 1, Integer::sum, LinkedHashMap::new)) // Maintain order
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)  // Find first repeated character
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println("First Repeating Character: " + firstRepeat);

        Character firstNonRepeat = input.chars()
                .mapToObj(c -> (char) c)  // Convert int stream to Character stream
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Preserve order
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)  // Filter unique characters
                .map(entry -> entry.getKey())  // Extract character
                .findFirst() // Get first non-repeating character
                .orElse(null);  // Return null if not found

        System.out.println("First Non-Repeating Character: " + firstNonRepeat);


        // 2nd approch

        Set<Character> seen = new HashSet<>();

        for (char ch : input.toCharArray()) {
            if (seen.contains(ch)) {
                System.out.println("First Repeating Character: " + ch);
                break;
            }
            seen.add(ch);
        }

        System.out.println("hash set: " + seen);
    }
}