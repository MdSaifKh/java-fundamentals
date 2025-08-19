package com.designpatterns;

import com.designpatterns.Structural.AdapterPattern;

public class App {
    public static void main(String []args){
        EmployeeSingleton employeeSingleton = EmployeeSingleton.getInstance("Saif","Kol",1200);
        EmployeeSingleton employeeSingleton1 = EmployeeSingleton.getInstance("Danish","hyd",1250);
        System.out.println(employeeSingleton.getName());
        System.out.println(employeeSingleton1.getName());
        AdapterPattern adapterPattern = new AdapterPattern();
        adapterPattern.print();
    }
}
