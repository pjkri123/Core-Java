package com.objectClass;

public class Example1 {
    public static void main(String[] args) {
        Number n=0.2f;
        Class c1=n.getClass();
        Class<?> c2=n.getClass();
        Class<? extends Number> c3=n.getClass();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
