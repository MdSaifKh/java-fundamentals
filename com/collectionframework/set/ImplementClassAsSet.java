package com.collectionframework.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ImplementClassAsSet {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student(2,"saif"));
        studentSet.add(new Student(4,"danish"));
        studentSet.add(new Student(2,"harshit"));

        studentSet.forEach(System.out::println);
    }
}
