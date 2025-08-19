package com.designpatterns;

public class EmployeeSingleton {
    private String name;
    private String address;
    private int salary;
    private EmployeeSingleton(){

    }

    private EmployeeSingleton(String name, String address, int salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    private static EmployeeSingleton employeeSingleton = null;

    public static EmployeeSingleton getInstance(String name, String address, int salary){
        if (null == employeeSingleton){
            employeeSingleton = new EmployeeSingleton(name, address, salary);
        }
        return employeeSingleton;
    }
    public String getName(){
        return this.name;
    }
}
