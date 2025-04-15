package com.test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Singleton1 {

    public static  Singleton1  instance;

    private Singleton1() {
    }

    public static Singleton1 getInstance(){


        if(instance == null) {
            synchronized (Singleton1.class) {
                instance = new Singleton1();

            }
        }

        return instance;
    }

    public static void main(String[] args){
       System.out.println(Singleton1.getInstance());
        System.out.println(Singleton1.getInstance());

        List<Employee> listEmp = Arrays.asList(new Employee(1,"chandra","bang")
        ,new Employee(2,"sekar","bang")
                ,new Employee(3,"Chandra sekar","bang")
                );



       List<String> listadd= listEmp.stream().filter(e -> e.getName().toLowerCase().startsWith("chandra")).map(Employee::getAddress).toList();
        System.out.println(listadd);
    }

    // id, name, address - employee

    //list of employee

    // name - start with mahesh

}
