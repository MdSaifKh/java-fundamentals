package com.collectionframework.list;

import java.util.Stack;

public class StackExamples {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Tiger");
        stack.push("Lion");
        stack.push("Dog");

        //stack.forEach(System.out::println);

        System.out.println(stack.peek()); // display element on top
    }
}
