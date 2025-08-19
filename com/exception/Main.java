package com.exception;
class Parent{
    public void calculate(){
        int x = 10;
        //throw new ArithmeticException("divide by zero");
        System.out.println(x);
        System.out.println("In Parent calculate");
    }
}
class ChildOne extends Parent{
    int x = 20;
    public void run(){
        System.out.println("Running");
    }
    public void calculate() throws RuntimeException{
        System.out.println(x);
        System.out.println("ChildOne calculate ");
    }
}
public class Main {
    public static void main(String []args){
        Parent p0 = new Parent();
        p0.calculate();
        Parent p = new ChildOne();
        p.calculate();
        ChildOne obj = new ChildOne();
        obj.calculate();
    }
}
