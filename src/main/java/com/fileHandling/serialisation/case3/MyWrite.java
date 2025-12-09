package com.fileHandling.serialisation.case3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MyWrite {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\pkumar16\\Desktop\\JAVA PRGM\\Text_File\\third.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        Student s=new Student(3,"Rita",67.4f,"ECE");
        Student s1=new Student(4,"Isha",76.4f,"EE");
        oos.writeObject(s);
        oos.writeObject(s1);

        oos.close();
        fos.close();
    }
}
