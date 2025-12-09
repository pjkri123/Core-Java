package com.fileHandling.serialisation.assignment;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class RetrieveFloatData {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("C:/Users/pkumar16/Desktop/JAVA PRGM/Text_File/data.txt");
        DataInputStream dis=new DataInputStream(fis);
        int size=dis.readInt();
        for(int i=0;i<size;i++) System.out.println(dis.readFloat());
        dis.close();
        fis.close();
    }
}
