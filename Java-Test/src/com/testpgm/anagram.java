package com.testpgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class anagram {

    public  static void main(String[] args){
        String str1 = "Listen";
        String str2 = "Silent";

        str1 = str1.replace("\\s", "").toUpperCase();
        str2 = str2.replace("\\s", "").toUpperCase();

        if(str1.length() != str2.length()){
            System.out.println("length are not valid");
        }
        char[] arr1= str1.toCharArray();
        char[] arr2= str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println(arr1 + " and " + arr2 + " are Anagrams.");
        }else{
            System.out.println(arr1 + " and " + arr2 + " are Not Anagrams.");
        }
        List<String> lis=new ArrayList<>();
        lis.add("ABC");
        lis.add("xyz");
        lis.add("PQR");

        List<String> sort=  lis.stream().sorted().collect(Collectors.toList());
        System.out.println(sort);


    }
}
