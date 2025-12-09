package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectDemo {
    public static void main(String[] args) {
        /*
        MyClass myClass=new MyClass();
        Class c=myClass.getClass();
         */

        Class c=MyClass.class; // for class
        System.out.println(c.getName());

        // for fields or variables
        Field[] field=c.getDeclaredFields();
        for (Field f:field) System.out.println(f);

//        for constructors
        Constructor[] con=c.getConstructors();
        for (Constructor ct:con) System.out.println(ct);

//        for methods
        Method[] meth=c.getMethods();
        for (Method m:meth) System.out.println(m);

//        for parameters
        Parameter[] param=meth[0].getParameters();
        for (Parameter p:param) System.out.println(p);

    }
}
