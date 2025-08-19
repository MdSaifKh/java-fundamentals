package com.practice;

import java.util.ArrayList;
import java.util.List;

class AmexEmployee implements Cloneable{
    private String name;
    private int age;
    private int salary;

    public AmexEmployee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public AmexEmployee clone() {
        try {
            AmexEmployee clone = (AmexEmployee) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
public class EmployeeFilter {
    public static void main(String []args) {
        List<AmexEmployee> empList = new ArrayList<>();
        empList.add(new AmexEmployee("Saif", 28, 1200));
        empList.add(new AmexEmployee("Harshit", 27, 1300));
        empList.add(new AmexEmployee("Vishnu", 25, 1500));
        empList.add(new AmexEmployee("Sree", 29, 1100));

        List<AmexEmployee> filteredEmp = empList.stream()
                .filter(emp -> emp.getAge() > 25 && emp.getSalary() > 1100)
                .toList();
        filteredEmp.forEach(x-> System.out.println(x.getName()));
        AmexEmployee tempEmp = empList.get(0).clone();
        tempEmp.setName("Danish");
        System.out.println("e1 "+empList.get(0).getName());
        System.out.println("e2 "+tempEmp.getName());
    }
}
