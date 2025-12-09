package com.collections.generics.example3;

public class MainGenericChild {
    public static void main(String[] args) {
        GenericChildClass<Float> a=new GenericChildClass<>();
        /*
        we can't write GenericChildClass<String> a=new GenericChildClass<>();
        because T is extending numbers only(float, double, int etc)
         */
        a.append(10.5f);
        a.append(10.56f);
        a.append(10.57f);

        a.display();
    }
}
