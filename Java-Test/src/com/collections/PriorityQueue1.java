package com.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue1 {

       public static void main (String[] args){
           PriorityQueue<Integer> p = new PriorityQueue<>();

           // Add elements to the queue
           p.add(5);
           p.add(2);
           p.add(8);
           p.add(1);

           // Print the head of the queue
           System.out.println("Head of Queue : " + p.peek());

           p.forEach((val) -> System.out.println(val));
           while (!p.isEmpty()){
               System.out.println("poll value: " +p.poll());
           }

    }
}
