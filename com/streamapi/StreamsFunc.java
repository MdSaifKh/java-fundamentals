package com.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsFunc {
    List<String> names = Arrays.asList("Saif", "Fara", "Sabrina", "Kaissar", "Harshit");
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,11,22,33,44,111,1,4,22);
    List<Employee> empList = new ArrayList<>();
    public StreamsFunc(){
        empList.add(new Employee("Saif","Sales",1200));
        empList.add(new Employee("Harshit","IT",1250));
        empList.add(new Employee("Vishnu","Sales",1100));
        empList.add(new Employee("Avinash","Tax",1000));
    }


    public void filterNames(){
        names.stream().filter(x -> x.charAt(0) == 'S').forEach(System.out::println);
    }

    public void filterOnes(){
        numbers.stream().map(x-> x+"").filter(e -> e.startsWith("1"))
                .map(Integer::parseInt).forEach(System.out::println);
    }
    public void filterDuplicates(){
        Set<Integer> myset = new HashSet<>();
        numbers.stream().filter(x -> !myset.add(x)).forEach(System.out::println);
    }

    public void removeDuplicates(){
        numbers.stream().distinct().forEach(System.out::println);
    }
    public void groupEmpByDept(){
        empList.stream().collect(Collectors.groupingBy(Employee::getDept)).forEach(
                (k,v)-> System.out.println("dept :"+k +" employee : "+v)
        );
    }

    public void filterEmpWithHighestSalary(){
        empList.stream().max(Comparator.comparingInt(Employee::getSalary)).ifPresent(System.out::println);
    }

    public void displayAvgSalary(){
        double avg = empList.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
        System.out.println("avg salary : "+avg);
    }

    public void displayNamesAsSingleString(){
        String names = empList.stream().map(Employee::getName).collect(Collectors.joining(", "));
        System.out.println("Names \n"+names);
    }
    public void sortEmpDesc(){
        empList.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).forEach(
                System.out::println
        );
    }

    public void findFirstHighestSalary(){
        empList.stream().max(Comparator.comparingInt(Employee::getSalary)).ifPresent(System
                .out::println);
    }
    public void findSecondHighestSalary(){
        empList.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1).findFirst().ifPresent(System
                .out::println);
    }

}
