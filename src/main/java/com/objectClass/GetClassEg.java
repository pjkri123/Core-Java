package com.objectClass;

import java.lang.reflect.Method;

public class GetClassEg {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls=Class.forName("java.lang.String");

        System.out.println(cls);
        System.out.println("ClassName: "+cls.getName());
        for(Method method:cls.getDeclaredMethods())
            System.out.println(" - "+method.getName());
    }
}
