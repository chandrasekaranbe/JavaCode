package com.java;

import java.util.Scanner;

public class FibonacciRecursion {

    public static int fibonacci(int n) {
        if (n <= 0) return 0;  // Base case F(0) = 0
        if (n == 1) return 1;  // Base case F(1) = 1
        return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive case
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
        scanner.close();
    }
}
