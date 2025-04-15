package com.Test1;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonReaptedInt {

    public static void main (String[] args){

        List<Integer> lis = Arrays.asList(1,1,2,2,3,4,5,5,6,6);

        Set<Integer> nonRep =lis.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).collect(Collectors.toSet());
        System.out.println("Non Repeat Number : " + nonRep);

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Integer> odd = list1.stream().filter( e -> e % 2 !=0).collect(Collectors.toList());
        System.out.println("ODD Number: " +odd);
        List<Integer> even = list1.stream().filter( e -> e % 2 ==0).collect(Collectors.toList());
        System.out.println("Even Number : " +even);

        int num = list1.stream().mapToInt(e -> e).min().orElse(0);
        System.out.println("min Number : " +num);
        Object[] arr = {10, 'A', 20, '#', 30, '!', 40}; // Mixed array
        int sum =0;
        for(Object obj :arr){
            if(obj instanceof Integer){
                sum += (Integer) obj;
            }
        }

        System.out.println("Integer Sum : " +sum);


    }
}
