package com.abtraction;
abstract class Animal{
    String color;
    public Animal(String color){
        this();
        this.color = color;
    }
    public Animal(){
        this.color = "Black";
        System.out.println("Animal default constructor called");
    }
    public void sound(){
        System.out.println("Animal sound");
    }
    abstract void walk();

    static void run(){
        System.out.println("Animal static method called");
    }
}
class Dog extends Animal implements Cloneable{
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

    @Override
    public Dog clone() {
        try {
            return (Dog) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
class Cat extends Animal implements Cloneable{

    Cat(){
        System.out.println("Cat default constructor called");
    }
    @Override
    void walk() {
        System.out.println("Cat walk");
    }

    @Override
    public Cat clone() {
        try {
            return (Cat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
public class AbstractClassExample {
    public static void main(String [] args){
//        Animal tommy = new Dog();
//        tommy.sound();
//        tommy.walk();

        Cat cat = new Cat();
        cat.walk();
        Animal cat1 = new Cat();

    }
}
