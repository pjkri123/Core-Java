package com.fileHandling.serialisation.case1;

import java.io.*;

public class MyRead {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("C:\\Users\\pkumar16\\Desktop\\JAVA PRGM\\Text_File\\third.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(fis));

        int roll=Integer.parseInt(br.readLine());
        String name=br.readLine();
        String dept= br.readLine();
        System.out.println("\nRoll No: "+roll+", Name: "+name+", Dept: "+dept);

        br.close();
        fis.close();
    }
}
