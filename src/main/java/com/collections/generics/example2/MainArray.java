package com.collections.generics.example2;

public class MainArray {
    public static void main(String[] args) {
        GenericArray<Integer> arr=new GenericArray<>();
        arr.append(10);
        arr.append(20);
        arr.append(30);

        arr.display();

        GenericArray<String> str=new GenericArray<>();
        str.append("apple");
        str.append("banana");

        str.display();

        GenericArray gen=new GenericArray();
        gen.append("Hi");
        gen.append(10);
        gen.append("bye");

        gen.display();

        MyArray my=new MyArray();
        my.append("Hi");
        my.append("go");
        my.append("bye");

        my.display();

        MyArray2 my2=new MyArray2(); //MyArray2<String> my2=new MyArray2(); can't write this because it is already defined in MyArray2 class
        my2.append("Hi");
        my2.append("gone");
        my2.append("bye");

        my2.display();

        MyArray3<String> my3=new MyArray3<>();
        my3.append("Hi");
        my3.append("goes");
        my3.append("bye");

        my3.display();
    }
}
