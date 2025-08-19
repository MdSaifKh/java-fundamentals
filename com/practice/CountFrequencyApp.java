package com.practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountFrequencyApp {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,1,4,4,4,2,2,2,2,3,8,8,9,9,7);

        Map<Integer, Integer> result = new HashMap<>();
        for(Integer elem : list){
            result.merge(elem, 1, Integer::sum);
        }
        /*result.forEach((k,v)->{
            System.out.println(k + "  "+v);
        });*/

        for(Map.Entry<Integer,Integer> e: result.entrySet()){
            System.out.println(e);
        }
    }
}
