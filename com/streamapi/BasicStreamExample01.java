package com.streamapi;

import java.util.*;
import java.util.stream.Stream;

public class BasicStreamExample01 {
    public static void main(String []args){

        // print even number
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        list.stream().filter(i-> i%2==0).forEach(System.out::println);

        list.stream().filter(i-> i%2!=0).forEach(System.out::println);

        // print name starts with "S"
        List<String> names = Arrays.asList("Saif","Sabrina","Farha","Prince");
        names.stream().filter(name-> name.startsWith("S")).forEach(System.out::println);

        names.stream().filter(name-> name.toLowerCase().startsWith("s")).forEach(System.out::println);

        // print number starts with 1
        List<Integer> numbers = Arrays.asList(1,22,13,34,15,60,17);
        List<Integer> filteredNumbers = numbers.stream().map(str-> str + "").filter(number-> number.startsWith("1"))
                .map(Integer::parseInt).toList();
        System.out.println(filteredNumbers);

        // find duplicate in list
        List<Integer> allList = Arrays.asList(1,22,13,22,15,60,15);
        Set<Integer> myset = new HashSet<>();
        List<Integer> duplicates = allList.stream().filter(x-> !myset.add(x)).toList();
        System.out.println(duplicates);
        Stream.concat(numbers.stream(),allList.stream()).distinct().forEach(System.out::println);

        allList.stream().distinct().forEach(System.out::println);

        // find the first element
        List<Integer> allElements = Arrays.asList(10,22,13,22,15,60,15);
        allElements.stream().findFirst().ifPresent(System.out::println);
        String word = "Working as a backend java developer. Perform testing on new feature before moving to deployment.";
        System.out.println(word.toUpperCase());


    }
}
