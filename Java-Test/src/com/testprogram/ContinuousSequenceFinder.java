package com.test;

import java.util.*;
import java.util.stream.Collectors;

public class ContinuousSequenceFinder {
    public static void main(String[] args) {
        String input = "1 2 3 5 9 a 6 7 8 4 @ -5 -7 -3 -2 -1";

        // Extract valid numbers and sort them
        List<Integer> numbers = Arrays.stream(input.split(" "))
                .filter(s -> s.matches("-?\\d+"))  // Keep only valid integers
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());

        List<List<Integer>> sequences = new ArrayList<>();
        List<Integer> currentSequence = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (currentSequence.isEmpty() || numbers.get(i) == currentSequence.get(currentSequence.size() - 1) + 1) {
                currentSequence.add(numbers.get(i)); // Add to current sequence
            } else {
                if (currentSequence.size() > 1) sequences.add(new ArrayList<>(currentSequence));
                currentSequence.clear();
                currentSequence.add(numbers.get(i));
            }
        }
        if (currentSequence.size() > 1) sequences.add(currentSequence);  // Add last sequence

        // Print output sequences
        sequences.forEach(seq -> System.out.println(seq.stream().map(String::valueOf).collect(Collectors.joining(" "))));
    }
}