package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BasicStreamExample02 {
    public static void main(String []args){

        // print max length string
        List<String> words = Arrays.asList("Bangalore","Chennai","Mumbai","Delhi","MyPlaceAsansol");
        Optional<String> result = words.stream().reduce((word1, word2)->
                word1.length()>word2.length()?
                        word1:word2);
        result.ifPresent(System.out::println);
        // print max/sum/min from list (replace max with (sum,min))
        List<Integer> numbers = Arrays.asList(11,55,33,66,44,22);
        System.out.println(numbers.stream().count());
        // by reduce method
        numbers.stream().reduce(Integer::max).ifPresent(System.out::println);
        // by max method of stream
        numbers.stream().max(Integer::compare).ifPresent(System.out::println);

        List<String> countries = Arrays.asList("India","Nepal","India");
        Map<String, Long> countryWithCount = countries.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countryWithCount);

        /* group objects of Employee class in Java 8 */
        //EmpByCity =  emp.stream().collect(Collectors.groupingBy(Employee::getCity));

        countries.stream().map(country-> new StringBuilder(country).reverse().toString()).forEach(System.out::println);
    }

}
