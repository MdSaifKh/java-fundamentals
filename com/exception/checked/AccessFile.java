package com.exception.checked;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class AccessFile {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input : ");
        String fileName = sc.next();
        try(
                FileOutputStream fos = new FileOutputStream(fileName);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                ){
            oos.write("Hello".getBytes());
            System.out.println("Successfully written");

        }catch (FileNotFoundException e) {
            System.out.println("=====FILE NOT FOUND EXCEPTION===="+e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void display(){
        System.out.println("Displaying the message");
        throw new RuntimeException();
    }
}
