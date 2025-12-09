package com.collections.generics.example2;

public class GenericArray<T> {
    private T A[] =(T[])new Object[10];
    private int length=0;

    public void append(T v) {
        A[length++]=v;
    }

    public void display() {
        for(int i=0;i<length;i++)
            System.out.println(A[i]);
    }
}
