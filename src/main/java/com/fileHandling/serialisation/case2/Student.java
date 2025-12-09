package com.fileHandling.serialisation.case2;

public class Student {
    private int rollNo;
    private String name;
    private String dept;

    public Student() {
    }

    public Student(int rollNo, String name, String dept) {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
