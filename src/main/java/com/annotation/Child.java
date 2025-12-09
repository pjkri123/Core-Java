package com.annotation;

public class Child extends Parent {
    @Override
    public void display() {
        System.out.println("Hello");
    }

    @Deprecated
    public void show() {
        System.out.println("Hi");
    }
}
