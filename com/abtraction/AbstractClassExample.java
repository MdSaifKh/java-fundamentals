package com.abtraction;
abstract class Animal{
    String color;
    public Animal(String color){
        this();
        this.color = color;
    }
    public Animal(){
        this.color = "Black";
    }
    public void sound(){
        System.out.println("Animal sound");
    }
    abstract void walk();
}
class Dog extends Animal{
    public Dog(){
        this("Blue");
    }
    public Dog(String color){
        super(color);
    }
    public void sound(){
        System.out.print("Dog is in color : ");
        System.out.println(this.color);
    }

    @Override
    void walk() {
        System.out.println("Dod is walking");
    }
}
public class AbstractClassExample {
    public static void main(String [] args){
        Animal tommy = new Dog();
        tommy.sound();
        tommy.walk();
    }
}
