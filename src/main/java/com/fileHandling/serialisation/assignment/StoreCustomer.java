package com.fileHandling.serialisation.assignment;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StoreCustomer {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("C:/Users/pkumar16/Desktop/JAVA PRGM/Text_File/customer.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        Customer[] customers={
                new Customer("Riya","9476537281"),
                new Customer("Prita","9676517283"),
                new Customer("Sia","9076587280"),
                new Customer("Raj","9476530288"),
                new Customer("Suresh","9276537981"),
                new Customer("Ash","9176530281")
        };
        oos.writeInt(customers.length);
        for(Customer c:customers) oos.writeObject(c);
        oos.close();
        fos.close();
    }
}
