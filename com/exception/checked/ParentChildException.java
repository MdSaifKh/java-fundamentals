package com.exception.checked;

import java.io.IOException;

class Parent{
    public void display() throws IOException {
        System.out.println("Parent");
    }
}

class Child extends Parent{
    public void display() {
        System.out.println("child");
    }
}
public class ParentChildException {
}
