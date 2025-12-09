package com.collections.generics.example7.wildcard.lowerBounded;

import com.collections.generics.example7.MyArray;

class A{}
class B extends A{}
class C extends A{}

public class Main {
    public static void show(MyArray<? super A> arr) {
        arr.display();
    }
    public static void main(String[] args) {
        MyArray<A> ma1=new MyArray<>();
        ma1.append(new B());

        MyArray<A> ma2=new MyArray<>();

        show(ma1);
        show(ma2);
    }
}
