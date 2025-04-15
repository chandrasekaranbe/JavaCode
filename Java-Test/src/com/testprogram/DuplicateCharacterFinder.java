package com.test;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacterFinder {
    public static void main(String[] args) {
        String input = "programming";

        // Find duplicate characters and their occurrences using Streams
        Map<Character, Long> duplicateChars = input.chars()
                .mapToObj(c -> (char) c)  // Convert int stream to Character stream
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Count occurrences
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)  // Keep only duplicates
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Duplicate Characters and their Occurrences: " + duplicateChars);
    }
}