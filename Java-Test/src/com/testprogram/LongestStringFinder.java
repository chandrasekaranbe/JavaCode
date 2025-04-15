package com.test;

import java.util.Arrays;
import java.util.Comparator;

public class LongestStringFinder {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "pineapple", "kiwi", "strawberry"};

        // Find the longest string using Java Streams
        String longest = Arrays.stream(words)
                .max((s1, s2) -> Integer.compare(s1.length(), s2.length())) // Compare by length
                .orElse(null); // Return null if array is empty

        System.out.println("Longest String: " + longest);

        String reverseword =Arrays.stream(words).max(Comparator.comparingInt(String::length))
                .map(e -> new StringBuilder(e).reverse().toString()).orElse("");
        System.out.println(reverseword);
    }
}
