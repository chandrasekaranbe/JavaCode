package com.testpgm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArrayStream {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        int[] a = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();

        System.out.println(Arrays.toString(a));


        reverseArray(arr);

    }

    public static void reverseArray(int[] arr){

        int i=0, j=arr.length-1;
        while (i < j){
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];

            i++;
            System.out.println("********* I " + i++);
            j--;
            System.out.println("********* J " + j++);
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
