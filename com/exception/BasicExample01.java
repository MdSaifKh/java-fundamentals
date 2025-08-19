package com.exception;

public class BasicExample01 {
    public static void main(String [] args){
        int i =5;
        int j = 0, result =0;
        try{
            result = i/j;
            System.out.println("Divide by zero");
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }finally{
            System.out.println("Closing resources");
        }
        System.out.println(result);
    }
}
