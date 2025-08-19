package com.basicstatic;

public class Example01 {
    int x = 10;
    void print(){
        System.out.println("print" +x);
    }
    static void display(){
        System.out.println("Display");
        Example01 ex = new Example01();
        ex.print();
    }
    public static void main(String []args){
        display();
    }
}
