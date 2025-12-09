package com.fileHandling.serialisation.assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RetrieveCustomer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream("C:/Users/pkumar16/Desktop/JAVA PRGM/Text_File/customer.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        int size=ois.readInt();
        for(int i=0;i<size;i++) System.out.println(ois.readObject());
        ois.close();
        fis.close();
    }
}
