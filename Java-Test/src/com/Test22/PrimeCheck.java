package com.Test2;

public class PrimeCheck {

    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false; // Found a divisor
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 17;
        System.out.println(num + " is prime? " + isPrime(num)); // Output: true
    }
}
