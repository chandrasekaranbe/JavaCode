package com.testpgm;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeAverageSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 60000),
                new Employee("Bob", "IT", 70000),
                new Employee("Charlie", "HR", 50000),
                new Employee("David", "HR", 55000),
                new Employee("Eve", "Finance", 75000),
                new Employee("Frank", "Finance", 80000)
        );

        Map<String, Double> avgsalary= employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(avgsalary);
        Optional<Double> highSal2 = employees.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(highSal2);
    }
}
