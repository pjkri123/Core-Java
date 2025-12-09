package com.fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamClass {
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\pkumar16\\Desktop\\JAVA PRGM\\Text_File\\Input\\sec.txt");
        FileInputStream fis=new FileInputStream(f);
        byte[] b=fis.readAllBytes();
        for(byte x:b) System.out.print((char)x);
        fis.close();
    }
}
