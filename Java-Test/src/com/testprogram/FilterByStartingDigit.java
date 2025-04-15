package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterByStartingDigit {
    public static void main(String[] args) {
        Integer[] numbers = {20, 12, 25, 32, 21, 45, 29, 23, 50};

        // Find all numbers starting with '2' using Java Streams
        List<Integer> result = Arrays.stream(numbers)
                .map(String::valueOf)  // Convert to String
                .filter(s -> s.startsWith("2")) // Filter numbers that start with '2'
                .map(Integer::valueOf)  // Convert back to Integer
                .collect(Collectors.toList()); // Collect to list

        System.out.println("Numbers starting with 2: " + result);
    }
}
