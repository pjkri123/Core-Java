package com.fileHandling.serialisation.case2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyWrite {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\pkumar16\\Desktop\\JAVA PRGM\\Text_File\\third.txt");
        DataOutputStream dos=new DataOutputStream(fos);

        Student s=new Student(2,"Rinki","IT");
        dos.writeInt(s.getRollNo());
        dos.writeUTF(s.getName());
        dos.writeUTF(s.getDept());

        dos.close();
        fos.close();
    }
}
