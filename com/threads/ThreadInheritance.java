package com.threads;

import java.util.List;

class Story extends Thread{
    public void run(){
        List.of(1,2,3,4,5).forEach(x-> System.out.println(x + " name : "+Thread.currentThread().getName()));
    }
}
class Task extends Story{
    public void run(){
        List.of(11,12,13,14,15).forEach(x-> System.out.println(x + " name : "+Thread.currentThread().getName()));
    }
}
public class ThreadInheritance {
    public static void main(String[] args) {
        Story task1 = new Story();
        task1.start();
    }
}
