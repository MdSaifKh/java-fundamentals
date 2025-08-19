package com.threads;
class MyThread extends Thread{
    public void run(){
        //int j = 10/0;
        for(int i =1;i <=10 ;i++)
            System.out.println(i);
    }
}

public class MultiThread01 {
    public static void main(String []args){
        MyThread t1 = new MyThread(); //new thread
        MyThread t2 = new MyThread();
        t1.start(); // in thread pool - runnable state
        t2.start();
        /*for(int i =100;i <=1000 ;i++)
            System.out.print(i+" ");*/

    }
}
