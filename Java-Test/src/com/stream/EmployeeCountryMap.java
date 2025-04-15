package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeCountryMap {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "USA", "Engineering"),
                new Employee("Bob", "Canada", "HR"),
                new Employee("Charlie", "USA", "Sales"),
                new Employee("David", "UK", "Engineering"),
                new Employee("Eve", "Canada", "Finance")
        );

        Map<String,List<Employee>> employee = employees.stream().collect(Collectors.groupingBy(Employee::getCountry));
        System.out.println(employee);

        employee.forEach((country ,emplist) -> {
            System.out.println(country +" -> " + emplist);
        });

    }

    }
