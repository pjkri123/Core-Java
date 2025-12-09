package com.fileHandling.serialisation.case3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MyRead {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream("C:\\Users\\pkumar16\\Desktop\\JAVA PRGM\\Text_File\\third.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);

//        Student s=(Student) ois.readObject();
//        System.out.println(s);

        System.out.println(ois.readObject());
        System.out.println(ois.readObject());
    }
}
