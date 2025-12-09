package com.fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\pkumar16\\Desktop\\JAVA PRGM\\Text_File\\Input\\first.txt");
        FileReader fr=new FileReader(f);
        int ch;
        if(f.canRead()) while((ch=fr.read())!=-1) System.out.print((char)ch);
        else System.out.println("You have not allowed to read files");
        fr.close();
    }
}
