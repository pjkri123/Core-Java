package com.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sn=new Scanner(new File("C:\\Users\\pkumar16\\Desktop\\JAVA PRGM\\Text_File\\Input\\first.txt"));
        while(sn.hasNextLine()) System.out.println(sn.nextLine());
    }
}
