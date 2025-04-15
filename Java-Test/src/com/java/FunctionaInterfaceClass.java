package com.java;

public class FunctionaInterfaceClass {
    public  static void  main (String[] args){
        MyFunctionalInterface myFunctionalInterface = (data -> System.out.println("Execute ** " + data));
        myFunctionalInterface.execute("chandra");
        myFunctionalInterface.validate("Chandra");
    }
}
