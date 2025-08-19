package com.practice;

import java.io.*;

class Employee implements Serializable {
    int age = 20;
    String name = "Saif";

    public void display(){
        System.out.println("Employee");
    }
}

public class OverloadingExample {
    public String sum(int a, int b){
        return "";
    }
    public int sum(int a)  {
        return 1;
    }
    public static void main(String args[])  {

        String path = "C:\\Users\\saif\\Downloads\\employee.txt";
        Employee emp = new Employee();
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp);

            fos.close();
            oos.close();
            System.out.println("Written");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        String s = "Hello";
//        System.out.println(s.getBytes());
//        s = s+" world";
//        System.out.println(s.getBytes());
//        OverloadingExample obj = new OverloadingExample();
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Thread started");
//            }
//        });
//        t.start();
    }
}
