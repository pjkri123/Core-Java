package com.fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamClass {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\pkumar16\\Desktop\\JAVA PRGM\\Text_File\\Input\\sec.txt");
        //f.setWritable(true);
        try(FileOutputStream fos=new FileOutputStream(f)) {
            String s="Hello Java";
            byte[] b=s.getBytes();
/*
            //fos.write(s.getBytes());
            for(byte x:b)
                fos.write(x);
            //fos.write(b, 6, str.length()-6);
*/

            //f.setReadOnly(); //read only mode

            if(f.canWrite()) fos.write(b);
            else System.out.println("You have not allowed to write texts.");
        }
        catch(IOException e) {
            System.err.println("Something is wrong. Check once again.");
        }
    }
}
