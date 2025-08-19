package com.practice;

public enum Person {
    Saif(1200), Sabrina(800),Harshit(1230), Vishnu(1000);
    private int salary;

    Person(int salary){
        this.salary = salary;
        System.out.println("Constructor called for "+ this.toString());
    }

    public int getSalary(){
        return this.salary;
    }
}
