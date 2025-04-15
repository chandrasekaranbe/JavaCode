package com.Test2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ReplaceDuplicates {
    public static String replaceDuplicates(String input) {
        Map<Character, Integer> charCount = new HashMap<>();
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        // Count occurrences of each character
        for (char ch : input.toCharArray()) {
            System.out.println(charCount.getOrDefault(ch, 0) + 1);
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            seen.add(ch);
        }
        System.out.println(charCount);
        // Replace duplicates

        for (char ch : input.toCharArray()) {
            if (seen.contains(ch) && charCount.get(ch).intValue() > 1) {
                result.append(charCount.get(ch)); // Replace with count
            } else {
                result.append(ch); // Keep first occurrence
               // seen.add(ch); // Mark as seen
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Automationa";
        String output = replaceDuplicates(input.toLowerCase());
        System.out.println("Output: " + output); // Expected Output: "2u22m22i2n"
    }

}
