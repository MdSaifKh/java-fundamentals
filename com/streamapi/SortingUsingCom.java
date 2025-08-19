package com.streamapi;

import java.util.*;

public class SortingUsingCom {
    public static void main(String []args){
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Saif","Sales",1200));
        empList.add(new Employee("Harshit","IT",1250));
        empList.add(new Employee("Vishnu","Sales",1100));
        empList.add(new Employee("Avinash","Tax",1000));
        Collections.sort(empList, new NameComparator());
        System.out.println(empList);
    }
}
