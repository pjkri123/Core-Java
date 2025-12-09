package com.fileHandling.serialisation.case2;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class MyRead {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("C:\\Users\\pkumar16\\Desktop\\JAVA PRGM\\Text_File\\third.txt");
        DataInputStream dis=new DataInputStream(fis);

        System.out.println("Roll No:"+dis.readInt()+", Name: "+dis.readUTF()+", Dept: "+dis.readUTF());

        dis.close();
        fis.close();
    }
}
