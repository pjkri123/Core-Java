package com.fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterClass {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\pkumar16\\Desktop\\JAVA PRGM\\Text_File\\Input\\sec.txt",true));
        bw.newLine();
        bw.write("Nice to learn");
        bw.close();
    }
}
