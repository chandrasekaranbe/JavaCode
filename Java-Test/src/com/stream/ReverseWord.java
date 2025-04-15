package com.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWord {

    public  static void main(String[] args) {
        String reverse = "welcome to chandra welcome";
        List<String> getReverse = Arrays.stream(reverse.split(" ")).sorted().collect(Collectors.toList());
        System.out.println(getReverse);

        String[] str = reverse.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for(String st : str){
            stringBuilder.append(new StringBuffer(st).reverse()).append(" ");
        }
        System.out.println(stringBuilder.toString());

    }
}
