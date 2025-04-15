package com.Test1;

@FunctionalInterface
public interface TestFunctionalInterface {
    // abstract method
    void execute(String name);

    default void add(int a, int b) {
        System.out.println( a+b);
    }

}
