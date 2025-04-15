package com.test4;

import java.util.*;

    public class Test2 {
    //linked list using comparable

    public static void main(String[] arg) {
        List<Employee> listval = new LinkedList();

        Employee emp = new Employee(1, "sekar",25000);
        Employee emp1 = new Employee(2, "chandra",20000);
        Employee emp2 = new Employee(3, "chandraSekar",40000);

        listval.add(emp);
        listval.add(emp1);
        listval.add(emp2);
        Collections.sort(listval);
        listval.forEach( e -> System.out.println(e.getId() +":" +e.getName()));

        long count = listval.stream().filter(e -> e.getName().toLowerCase().startsWith("chan")).count();
        List<Double> name = listval.stream().filter(e -> e.getName().toLowerCase().startsWith("chan")).
                map(Employee::getSalary).sorted(Comparator.reverseOrder()).toList();

        Optional<Employee> second = listval.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();

        second.ifPresent(e1 ->
                System.out.println("2nd Highest Salary Employee: " + e1)
        );
        System.out.println(count);
        System.out.println(name);
        System.out.println(second);
    }
}
