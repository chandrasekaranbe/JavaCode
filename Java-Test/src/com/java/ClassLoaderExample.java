package com.java;

public class ClassLoaderExample {

    public static void  main(String[] args){
        String name;
        ClassLoader classLoader = String.class.getClassLoader();
        ClassLoader classLoader1 = ClassLoaderExample.class.getClassLoader();

        System.out.println(classLoader1);
        System.out.println(classLoader);

        try {
            Class<?> myClass = Class.forName("com.java.ClassLoaderExample");
            Object myInstance = myClass.newInstance();
            System.out.println(myInstance);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
