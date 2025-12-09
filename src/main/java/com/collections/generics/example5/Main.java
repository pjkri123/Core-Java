package com.collections.generics.example5;

public class Main {
    public static void main(String[] args) {
        GenericChildClass<A> a=new GenericChildClass<>();
        a.append(new B());
        a.display();
    }
}
