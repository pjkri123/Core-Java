package com.fileHandling.serialisation.case3;

import java.io.Serializable;

public class Student implements Serializable {
    private int rollNo;
    private String name;
    private float avg;
    private String dept;
    public static int Data=10;
    public transient int t;

    public Student()
    {

    }
    public Student(int rollNo,String name,float avg,String dept)
    {
        this.rollNo=rollNo;
        this.name=name;
        this.avg=avg;
        this.dept=dept;
        Data=500;
        t=500;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public static int getData() {
        return Data;
    }

    public static void setData(int data) {
        Data = data;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", avg=" + avg +
                ", dept='" + dept + '\'' +
                ", data=" + Data +
                ", t=" + t +
                '}';
    }
}
