package com.test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueCharacterFinder {
    public static void main(String[] args) {
        String input = "programming";

        // Find unique characters using Java Streams
        Set<Character> uniqueChars = input.chars()
                .mapToObj(c -> (char) c)  // Convert int stream to Character stream
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Count occurrences
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)  // Keep only unique characters
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        System.out.println("Unique Characters: " + uniqueChars);
    }
}
