package com.exception;

import java.io.Serializable;

class MyExceptionExample implements Serializable {
   public void show(){
       try{
           throw new ArrayIndexOutOfBoundsException("Out of bound exception");
       }finally{
           throw new ArithmeticException("Divide by zero");
       }
   }
}
public class FinaalyBlockException01 {
    public static void main(String []args){
        MyExceptionExample obj = new MyExceptionExample();
        try{
            obj.show();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
