package com.collections.generics.example3;

public class GenericChildClass<T extends Number> {
    /*
    *Why new Object[10] is problematic
1.	Type Erasure:
•	Java generics use type erasure, which means the generic type T is replaced with Object at runtime.
•	So, T[] becomes Object[] internally, but the compiler still expects a T[].

2.	Unchecked Cast Warning:
•	When you write (T[]) new Object[10], you're telling the compiler to trust you that this Object[] is actually a T[].
•	This cast is unchecked, meaning the compiler can't verify it at compile time and will issue a warning.

3.	Runtime Type Safety:
•	If you later assign a value of type T to this array, and the actual object is not compatible with Object[], it could cause a ClassCastException at runtime.
     */
    private T A[] =(T[])new Number[10];
    private int length=0;

    public void append(T v) {
        A[length++]=v;
    }

    public void display() {
        for(int i=0;i<length;i++)
            System.out.println(A[i]);
    }
}
