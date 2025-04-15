package com.test3;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] arg) {
//        String str = "Javva is concept of a day";
//        String str1 = str.trim().replace(" ","");
//        System.out.println(str1);
//        Character duplicatechar= str1.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//                .entrySet().stream().filter(e -> e.getValue() > 1).map(e -> e.getKey()).findFirst().orElse(null);
//
//        System.out.println(duplicatechar);

        int[] arr ={1,3,2,5,3,6,5,3}; // find duplicate & missing number

        Set<Integer> set = new HashSet<>();
        List<Integer> duplist = new ArrayList<>();
         for(int a : arr){
             if (!set.contains(a)) {
                 set.add(a);
                 System.out.println(a);
             }else{
                 System.out.println("Duplicate : " + a);
                 duplist.add(a);
             }
         }

         //for (int seq : set){
        System.out.println("size of set : " + set.size());
             for(int i = 1; i < set.size() ; i++){
                 if(!set.contains(i)){
                     System.out.println(i);
                 }
             }
         //}


        String input = "a1b2c3d4e5f6g7h8i9j0";
        char[] arr1 = input.toCharArray();

        System.out.println("Original array: " + Arrays.toString(arr1));

        int[] nums = new String(arr1)
                .chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .toArray();

        System.out.println("Numbers only: " + Arrays.toString(nums));

        List<String> words = Arrays
                .asList("Java", "Stream", "API");

        Map<String, Integer> wordLengthMap = words
                .stream()
                .collect(Collectors
                        .toMap(word -> word, String::length));
        System.out.println(wordLengthMap);
                for(int i = 0; i < 5; i++) {
                    if(i == 3) {
                        break;
                    }
                    System.out.print(i + " ");
                }





    }
}
