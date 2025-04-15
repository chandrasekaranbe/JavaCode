package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args){
        var str = "test";
        var str1 = new String("test");
        var str2 = String.valueOf("test"); // why it has the same reference??

        System.out.println(str == str1); //? flase
        System.out.println(str1 == str2); //? false
        System.out.println(str == str2); //? true == true // StringPool

        Integer num1 = 100;
        Integer num2 = 100;
        Integer num3 = 500;
        Integer num4 = 500;

        if(num1==num2){
            System.out.println("num1 == num2");
        }
        else{
            System.out.println("num1 != num2");
        }
        if(num3 == num4){
            System.out.println("num3 == num4");
        }
        else{
            System.out.println("num3 != num4");
        }
    }
}
