package com.annotation.userDefined;

@interface Anno {
    String name();
    String project();
    String date() default "today";
    String version() default "13";
}

//@Anno //for empty interface
//@Anno(name = "puja", project = "bank", date = "23/4/2025", version = "13") //for all method return value
@Anno(name = "puja", project = "bank")
public class Demo {
//    @Anno
    int data;

//    @Anno
    public static void main(String[] args) {
//        @Anno
        int x;
    }
}
