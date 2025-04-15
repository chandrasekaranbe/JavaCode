package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

    public static void main (String[] args){
        List<Employee> nameList = Arrays.asList(
                new Employee("Alice", 28, 90000),
                new Employee("Bob", 35, 120000),
                new Employee("Charlie", 40, 150000),
                new Employee("David", 25, 70000),
                new Employee("Eve", 32, 110000)
        );

        String names = nameList.stream().filter(e -> e.getAge() > 30 && e.getSalary() > 100000)
                .map(Employee::getName).collect(Collectors.joining(","));
        System.out.println(names);
    }
}
