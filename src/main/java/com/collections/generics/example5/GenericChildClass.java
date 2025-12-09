package com.collections.generics.example5;

public class GenericChildClass<T extends A> {
    // A is an interface but we need to use extends keyword here
    private T a[] =(T[])new A[10];
    private int length=0;

    public void append(T v) {
        a[length++]=v;
    }

    public void display() {
        for(int i=0;i<length;i++)
            System.out.println(a[i]);
    }
}
