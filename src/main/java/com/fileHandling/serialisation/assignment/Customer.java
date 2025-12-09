package com.fileHandling.serialisation.assignment;

import java.io.Serializable;

public class Customer implements Serializable {
    private String custId;
    private String name;
    private String phNo;

    private static int count;

    public Customer() {
    }

    public Customer(String name, String phNo) {
        custId = "C" + count++;
        this.name = name;
        this.phNo = phNo;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Customer.count = count;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId='" + custId + '\'' +
                ", name='" + name + '\'' +
                ", phNo='" + phNo + '\'' +
                '}';
    }
}
