package com.practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDeserializeApp {
    public static void main(String[] args) {
        User user = new User("Saif", 29);
        String path = "D:\\temp.txt";
        try(FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos)
        )
        {
            oos.writeObject(user);
            System.out.println("== Object is serialized ==");
        }catch (IOException e){
            System.out.println("Exception occurred : "+e);
        }
    }
}
