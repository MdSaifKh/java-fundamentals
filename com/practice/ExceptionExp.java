package com.practice;
class EmployeeExp{
    public void display() throws ArithmeticException{
        try{
            throw new ArithmeticException("ar");
        }catch(ArithmeticException e){
            System.out.println("catch");
        }finally{
            throw new ArrayIndexOutOfBoundsException("ex");
        }
    }
}
public class ExceptionExp {
    public static void main(String []args){
        new EmployeeExp().display();
    }
}
