package com.collections.generics.example1;

public class Box<T> {
    private T size;

    public void setSize(T size) {
        this.size=size;
    }

    public T getSize() {
        return size;
    }
}
