package com.collections.generics.example4;

public class Main {
    public static void main(String[] args) {
        GenericChildClass<A> a=new GenericChildClass<>();
        a.append(new A());
        a.display();
    }
}
