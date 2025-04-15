package com.test1;

import java.util.*;

public class printmissingnumber
{
    public static void main(String[] args){
        int[] a ={1,4,5,6};
        Set<Integer> set= new HashSet<>();

        int[] list =  Arrays.stream(a).toArray();

       for (int lis: list){
            set.add(lis);
        }

        for (int i= 1; i <= set.size(); i++){
            if(!set.contains(i)){
                System.out.println(i);
            }
        }

    }
}
