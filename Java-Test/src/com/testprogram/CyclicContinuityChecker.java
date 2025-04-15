package com.test;

public class CyclicContinuityChecker {

    public static boolean isCyclicRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        // Concatenate str1 with itself and check if str2 is a substring
        String doubled = str1 + str1;
        return doubled.contains(str2);
    }

    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";

        String a1 = "apple"; String a2 = new String("apple");
        int i = 5; int j = 5;

        System.out.println(a1==a2 );
        System.out.println(a1.equals(a2));
        System.out.println(i==j);

        if (isCyclicRotation(str1, str2)) {
            System.out.println(str2 + " is a cyclic permutation of " + str1);
        } else {
            System.out.println(str2 + " is NOT a cyclic permutation of " + str1);
        }
    }
}
