package com.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> lists=new ArrayList<>();
        lists.add(10);
        lists.add(14);
        lists.add(12);
        lists.add(9);
        lists.add(19);
        lists.add(30);
        Integer i=Collections.min(lists);
        System.out.println(i);

    }
}
