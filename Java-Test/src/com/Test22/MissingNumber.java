package com.Test2;

import java.util.stream.IntStream;

public class MissingNumber {

    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = IntStream.rangeClosed(1, n).sum();
        int actualSum = IntStream.of(arr).sum();
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Missing number is 3
        int n = 6;
        System.out.println("Missing Number: " + findMissingNumber(arr, n)); // Output: 3
    }
}
