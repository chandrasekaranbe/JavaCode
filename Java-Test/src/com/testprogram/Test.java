package com.test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args){



        //to find highest word count and reverse
        String lengthword = "chandraK sekar Brillio";
        String reverseword =Arrays.stream(lengthword.split(" ")).max(Comparator.comparingInt(String::length))
                .map(e -> new StringBuilder(e).reverse().toString()).orElse("");
        System.out.println(reverseword);

        //find element string start with A
        List<String> words3 = Arrays.asList("apple", "banana", "apple");
        List<String> ele = words3.stream().map(String::toUpperCase).filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(ele);

        //Remove Duplicate from List
        List<String> words2 = Arrays.asList("apple", "banana", "apple");
        List<String>  reduplicate= words2.stream().distinct().collect(Collectors.toList());
        System.out.println(reduplicate);

        //Find the first non-repeated character in a string.
        String input = "sekarr";
     Character nonRepChar5 = input.chars().mapToObj(c ->(char)c).collect(Collectors.groupingBy(
                Function.identity(),Collectors.counting())).entrySet().stream().filter(e ->e.getValue() == 1)
                .map(e -> e.getKey()).findFirst().orElse(null);

                System.out.println("*********  " + nonRepChar5);


        Optional<Character> nonRepChar = input.chars().mapToObj(c ->(char)c)
                        .filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
                                .findAny();
        System.out.println(nonRepChar);
        Set<Character> seenCharacters = new HashSet<>();
        Optional<Character> firstRepChar  = input.chars()  // Convert the string to an IntStream of character codes
                .mapToObj(c -> (char) c)  // Convert character codes to characters
                .filter(c -> !seenCharacters.add(c))  // Filter characters that are already in the set
                .findFirst();  // Return the first repeated character if found
        System.out.println(firstRepChar);

        Character nonRepChar1 = input.chars().mapToObj(c ->(char)c)
                .filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
                .findFirst().orElse(null);



        System.out.println(nonRepChar1);



       //Sort employees by salary.

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 5000),
                new Employee("Bob", 3000),
                new Employee("Charlie", 4000) );

        List<Employee> sortEmp = employees.stream().sorted(Comparator.comparingInt(e ->e.salary)).collect(Collectors.toList());
        System.out.println(sortEmp);

        //Concatenate strings using joining() .
        List<String> words1 = Arrays.asList("Java", "is", "awesome");
        String concat =words1.stream().collect(Collectors.joining(" "));
        System.out.println(concat);



        //Count word occurrences in a list using groupingBy() .
        List<String> words = Arrays.asList("apple", "banana", "apple");
        Map<String,Long> count= words.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        System.out.println(count);

        //Find the sum of numbers using reduce() .
        List<Integer> reduceNumbers = Arrays.asList(1, 2, 3, 4);
        Integer reduce = reduceNumbers.stream().reduce(Integer::sum).orElse(0);
        System.out.println(reduce);


        //Print a list using Lambda Expressions .
        List<String> list = Arrays.asList("Alice", "Bob", "Charlie");
        list.forEach(s -> System.out.println(s));

        //Filter even numbers from a list using Streams.
        List<Integer> list1= Arrays.asList(1, 2, 3, 4, 5, 6);
       List<Integer> evens = list1.stream().filter(n -> n % 2 ==0).collect(Collectors.toList());
        System.out.println(evens);

//Find the maximum value in a list using Streams.
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
       Integer max =numbers.stream().max(Integer::compareTo).orElse(0);
        System.out.println(max);

        //Convert a list of strings to uppercase.
        List<String> names = Arrays.asList("alice", "bob");
        String upperCase = String.valueOf(names.stream().map(String::toUpperCase).collect(Collectors.toList()));
        System.out.println(upperCase.toString());

      //Group strings by their length using groupingBy() .
        List<String> names1 = Arrays.asList("Alice", "Bob", "Charlie");
        Map<Integer,List<String>> grouped= names1.stream().collect(Collectors.groupingBy(String::length));

        System.out.println(grouped);
    }
}


