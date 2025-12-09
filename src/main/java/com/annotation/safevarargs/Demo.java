package com.annotation.safevarargs;

class My<T> {
    @SafeVarargs
    private void show(T...args) {
        for(T x:args)
            System.out.println(x);
    }
}
public class Demo {
    public static void main(String[] args) {

    }
}

