package com.test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharactersStream {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "grapes");

        // Find duplicate characters using Java Streams
        Map<Character, Long> duplicateChars = words.stream()
                .flatMap(str -> str.chars().mapToObj(c -> (char) c))  // Convert each string to characters
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Count occurrences
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)  // Keep only duplicates
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Duplicate Characters: " + duplicateChars);
    }
}