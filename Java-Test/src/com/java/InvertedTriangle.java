package com.java;

public class InvertedTriangle {
    public static void main(String[] args) {
        int start = -1;
        int rows = 3;
        int num = 4 * start;

        for (int i = rows; i > 0; i--) {
           // System.out.println(" ********** I " + i);
            for (int j = 0; j < i; j++) {
               // System.out.println(" ********** J " + j);
                System.out.print(num + " ");
                num += 4;
            }
            System.out.println();
        }
    }
}
