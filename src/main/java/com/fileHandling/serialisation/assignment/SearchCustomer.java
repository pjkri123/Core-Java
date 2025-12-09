package com.fileHandling.serialisation.assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class SearchCustomer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sn=new Scanner(System.in);
        FileInputStream fis=new FileInputStream("C:/Users/pkumar16/Desktop/JAVA PRGM/Text_File/customer.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        int size=ois.readInt();
        Customer[] customers=new Customer[size];
        for(int i=0;i<size;i++) customers[i]=(Customer) ois.readObject();
        System.out.print("Enter customer name: ");
        String name=sn.nextLine();
        for(Customer c:customers)
            if(name.equalsIgnoreCase(c.getName()))
                System.out.println(c);
        ois.close();
        fis.close();
    }
}
