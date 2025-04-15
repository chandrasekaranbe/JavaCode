package com.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        Arrays.sort(arr);
        Set<Integer> number = new HashSet<>();
        for(int val : arr){
            number.add(val);
        }
        System.out.println(number);
        for (int i = 1; i < 10 ; i++) {
            if(!number.contains(i)){
                System.out.println(i + " ");
            }

        }
        }
}
