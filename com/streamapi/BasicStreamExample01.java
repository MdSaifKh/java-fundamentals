package com.streamapi;

import java.util.Arrays;
import java.util.List;

public class BasicFilter {
    public static void main(String []args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        list.stream().filter(i-> i%2==0).forEach(System.out::println);

        List<String> names = Arrays.asList("Saif","Sabrina","Farha","Prince");
        names.stream().filter(name-> name.startsWith("S")).forEach(System.out::println);
    }
}
