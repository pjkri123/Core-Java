package com.fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\pkumar16\\Desktop\\JAVA PRGM\\Text_File\\Input\\sec.txt"));
        String s;
        while((s=br.readLine())!=null) System.out.println(s);
    }
}
