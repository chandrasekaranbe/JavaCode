package com.java;

@FunctionalInterface
public interface MyFunctionalInterface {
    void execute(String data);

    default  void validate(String name){
        System.out.println("Welcome **** " + name);
    }
}
