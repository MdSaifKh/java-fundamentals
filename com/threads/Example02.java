package com.threads;
abstract class Human{
    abstract void sleep();
}
public class Example02 {
    static int x = 10;
    static int y;

    int z = 0;
    public static void main(String []args) {
        Human man = new Human() {
            @Override
            void sleep() {
                System.out.println("Man is sleeping");
                System.out.println(y);
                //System.out.println(z);
            }
            static void walk(){
                System.out.println("Man is walking");
            }
        };
        man.sleep();



    }
}
