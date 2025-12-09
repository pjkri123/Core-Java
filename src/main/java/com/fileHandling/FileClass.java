package com.fileHandling;

import java.io.File;
import java.io.IOException;

public class FileClass {
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\pkumar16\\Desktop\\JAVA PRGM\\Text_File\\Input\\second.txt");
        if(f.exists()) System.out.println("exists");
//        else if(f.mkdir()) System.out.println("Folder created");
        else if(f.createNewFile()) System.out.println("File created");
        System.out.println(f.length());
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.getName());

        File fRename=new File("C:\\Users\\pkumar16\\Desktop\\JAVA PRGM\\Text_File\\Input\\sec.txt");
        f.renameTo(fRename);
    }
}
