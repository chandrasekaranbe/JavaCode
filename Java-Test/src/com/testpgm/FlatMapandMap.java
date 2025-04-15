package com.testpgm;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FlatMapandMap {

    public static void main(String[] args){

        int[] a={1,2,3,4};
        int[] b={5,6,7,8};

        int[] c = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(c));

        String val="chandra";

        Character nonReapCh = val.chars().mapToObj(e -> (char)e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).sorted().findFirst().orElse(null);

        System.out.println(nonReapCh);
    }
}
