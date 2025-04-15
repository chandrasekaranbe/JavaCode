package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class SortZeroesAndOnes {
    public static void main(String[] args) {
            Integer[] array = {1, 1, 0, 1, 0};

        // Sort using Java Streams 0 0 1 1 1
        Integer[] sortedArray = Arrays.stream(array)
                .sorted()
                .toArray(Integer[]::new);

        //// Sort using Java Streams 1 1 1 0 0
        Integer[] sortedArray1 = Arrays.stream(array)
                .sorted(Comparator.comparingInt(Integer::reverse))
                .toArray(Integer[]::new);

        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray1));

    }
}