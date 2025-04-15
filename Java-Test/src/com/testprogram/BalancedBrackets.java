package com.test;

import java.util.*;

public class BalancedBrackets {
    public static void main(String[] args) {
        String exp1 = "[()]{}{[()()]()}";
        String exp2 = "[(])";

        System.out.println(isBalanced(exp1) ? "Balanced" : "Not Balanced");
        System.out.println(isBalanced(exp2) ? "Balanced" : "Not Balanced");
    }

    public static boolean isBalanced(String exp) {
        Stack<Character> stack = new Stack<>();

        Map<Character, Character> brackets = Map.of(')', '(', '}', '{', ']', '[');

        for (char ch : exp.toCharArray()) {
            System.out.println("********" + ch);
            if (brackets.containsValue(ch)) {  // Opening brackets
                System.out.println("******** 1" + ch);
                stack.push(ch);
            } else if (brackets.containsKey(ch)) {  // Closing brackets
                System.out.println("******** 2" + ch);
                if (stack.isEmpty() || stack.pop() != brackets.get(ch)) {
                    System.out.println("******** 3" + ch);
                    return false;  // Mismatch or stack empty
                }
            }
        }
        return stack.isEmpty();  // If stack is empty, brackets are balanced
    }
}
