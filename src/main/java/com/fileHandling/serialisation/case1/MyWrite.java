package com.fileHandling.serialisation.case1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class MyWrite {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\pkumar16\\Desktop\\JAVA PRGM\\Text_File\\third.txt");
        PrintStream ps=new PrintStream(fos);

        Student s=new Student();
        s.setRollNo(1);
        s.setName("Rina");
        s.setDept("CSE");
        ps.println(s.getRollNo());
        ps.println(s.getName());
        ps.println(s.getDept());

        ps.close();
        fos.close();
    }
}
