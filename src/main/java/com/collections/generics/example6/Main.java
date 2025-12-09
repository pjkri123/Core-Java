package com.collections.generics.example6;

public class Main {
    public static <E> void show(E[] arr) {
        for (E x:arr) System.out.println(x);
    }
    public static <E> void display(E... arr) {
        for (E x:arr) System.out.println(x);
    }
    public static <E extends Number> void dis(E... arr) {
        for (E x:arr) System.out.println(x);
    }
    public static void main(String[] args) {
        show(new String[]{"Hi","Go","Bye"});
        show(new Integer[]{10,20,30});

        display(20,40,60);
        display("Hello","Hi");

        dis(30,60,90);
        dis(30f,20f,10f);
    }
}
