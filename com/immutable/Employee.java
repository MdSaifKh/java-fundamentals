package com.immutable;

final class Employee {
    private final String name;
    private final int age;
    private final Address address;

    public Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public Address getAddress(){
        return new Address(address);
    }
}
