package com.java;

import com.java.Test1.Country;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Immuatable {

    public static void main(String[] args) {

        String s1 = "knowledge";
        String s2 = s1;            // s2 points to the same "knowledge"
        s1 = s1.concat(" base");   // creates a new String "knowledge base"

        System.out.println(s1);
        System.out.println(s2);

        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> System.out.println("Task executed"));

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(() -> System.out.println("Task executed in thread pool"));
        executorService.shutdown();  // Always shutdown executor

        //Reapted char

        String input = "programming";
        Map<Character,Long> reap = input.chars().mapToObj(c ->(char) c).collect(Collectors.groupingBy(
                Function.identity(),Collectors.counting()));
        reap.entrySet().stream().filter(e -> e.getValue() > 1).forEach(e -> System.out.println( e.getKey() +": "+ e.getValue()));

        System.out.println(reap);
        int[] numbers = {10, 20, 30, 40, 50};
        Arrays.stream(numbers) // Convert array to stream
        .forEach(System.out::println); // Print each number

        String input1 = "_programming_hello_";
        String cleaned = input1.replace("_", "").trim();

        // Convert first character to uppercase
        if (!cleaned.isEmpty()) {
            cleaned = cleaned.substring(0, 1).toUpperCase()+ cleaned.substring(1); ;
        }
        System.out.println(cleaned);

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 2, 3, 6, 7, 3, 8, 9, 1);
        // Find duplicates using grouping and filtering
        Set<Integer> duplicates = numbers1.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting())) // Count occurrences
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1) // Keep only duplicates
                .map(Map.Entry::getKey) // Extract keys (duplicates)
                .collect(Collectors.toSet()); // Collect as Set


        List<Country> countries = Arrays.asList(
                new Country("India", "Asia", 1400000000),
                new Country("China", "Asia", 1430000000),
                new Country("USA", "North America", 331000000),
                new Country("Canada", "North America", 38000000),
                new Country("Germany", "Europe", 83000000),
                new Country("France", "Europe", 67000000));

        Map<String,Long> cont = countries.stream().collect(Collectors.groupingBy(Country::getContinent,Collectors.summingLong(Country::getPopulation)))
                ;
        System.out.println(cont);

    }
}
