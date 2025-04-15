package com.test;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Map;

public class FirstNonRepeatCharacter {
    public static void main(String[] args) {
        String input = "chandra";


        Character chars= input.chars().mapToObj(c ->(char)c)
                .filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
                .findFirst().orElse(null);

        System.out.println("First Non-Repeating Character: " + chars);

        // Find first non-repeating character
        Character firstNonRepeat = input.chars()
                .mapToObj(c -> (char) c)  // Convert int stream to Character stream
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Preserve order
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)  // Filter unique characters
                .map(entry -> entry.getKey())
                .sorted()// Extract character
                .findFirst() // Get first non-repeating character
                .orElse(null);  // Return null if not found

        System.out.println("First Non-Repeating Character: " + firstNonRepeat);


        //Alternate Approach

        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        char firstNonRepeat1 = charCount.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println("First Non-Repeating Character: " + firstNonRepeat1);
    }
}