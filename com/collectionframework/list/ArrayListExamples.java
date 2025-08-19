package com.collectionframework.list;

import java.util.List;

public class ArrayListExamples {



    public static void main(String[] args) {
        List<Integer> list = List.of(1,8,5,9,3,5);
        list.forEach(x-> System.out.println("printing x "+x));
        /*Iterator<Integer> it = list.iterator();
        it.forEachRemaining(System.out::println);*/
    }
}
