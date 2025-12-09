package com.collections.generics.example1;

public class MainBox {
    public static void main(String[] args) {
        Box<Integer> box=new Box<>();
        box.setSize(25);
        System.out.println(box.getSize());
    }
}
