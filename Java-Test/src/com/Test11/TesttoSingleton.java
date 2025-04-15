package com.Test1;

import com.test.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TesttoSingleton {

    public static void main(String[] args){

        TestFunctionalInterface functionalinterface = name -> System.out.println(name);
        functionalinterface.execute("Chandra");
        functionalinterface.add(3,4);

        SingltonCls instance1 =  SingltonCls.getInstance();
        SingltonCls instance = SingltonCls.getInstance();
        System.out.println(instance);
        System.out.println(instance1);
          if(instance == instance1){
              System.out.println("True");
          }else if(instance.equals(instance1)){
              System.out.println("false");
          }else{
              System.out.println("Test");
          }


          Employee employee= new Employee("chandra","hr");
         Employee employee2= new Employee("sekar","admin");
         Employee employee3= new Employee("john","finance");
         Employee employee4= new Employee("rahul","finance");

        List<Employee> listEmp = new ArrayList<>();
        listEmp.add(employee);
        listEmp.add(employee2);
        listEmp.add(employee3);
        listEmp.add(employee4);

        Map<String, List<Employee>> list = listEmp.stream().collect(Collectors.groupingBy(Employee::getDept));
        System.out.println(list);

        Map<String, List<Employee>> list1 = listEmp.stream().collect(Collectors.groupingBy(e-> e.getDept()));
        System.out.println(list1);


        List<Integer> listVal = Arrays.asList(10,20,30,40,50,60);
        Stream<Object> val = listVal.stream().flatMap(x -> listVal.stream().filter(y -> x + y ==100).sorted());

        System.out.println(val.toList());

        List<Integer> result = listVal.stream()
                .filter(a -> listVal.contains(100 - a)) // Single filter condition
                .limit(2) // Limit to two numbers (to avoid duplicates)
                .collect(Collectors.toList());

        System.out.println(result);


        for(int i = 0; i < 5; i++) {
            System.out.println(i + ' ');
        }
    }
}
