package com.fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\pkumar16\\Desktop\\JAVA PRGM\\Text_File\\Input\\first.txt");
        FileWriter fw=new FileWriter(f);
        if(f.canWrite())  fw.write("I like java technologies.\nI want to be java developer.");
        else System.out.println("you have not allowed to write texts");
        fw.close(); //always close fileWriter. instead of close() we can use try() for closing this class.
    }
}
