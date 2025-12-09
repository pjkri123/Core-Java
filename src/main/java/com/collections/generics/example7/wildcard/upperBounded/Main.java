package com.collections.generics.example7.wildcard.upperBounded;

import com.collections.generics.example7.MyArray;

public class Main {
    public static void show(MyArray<? extends Number> arr) {
        arr.display();
    }
    public static void main(String[] args) {
        MyArray<String> ma1=new MyArray<>();
        ma1.append("Hi");
        ma1.append("Bye");

        MyArray<Integer> ma2=new MyArray<>();
        ma2.append(10);
        ma2.append(20);

//        show(ma1);
        show(ma2);
    }
}
