package com.practice;
class Human{
    protected void walk() throws Exception{
        System.out.println("Human walk");
    }
    public void display() throws Exception {
        System.out.println("display");
        throw new Exception();
    }
}
class Man extends Human{
    public void walk() throws RuntimeException{
        System.out.println("Man walk");
    }
}
public class OverriddingExp {
    public static void main(String []args) throws Exception {
        Human human = new Man();
        human.walk();


    }
}
