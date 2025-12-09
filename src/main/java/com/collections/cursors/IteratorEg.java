package com.collections.cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEg {
    public static void main(String[] args) {
        List<Integer> lists=new ArrayList<>();
        lists.add(10);
        lists.add(20);
        lists.add(30);

        Iterator<Integer> itr=lists.iterator();

//        lists.add(40); //it throws ConcurrentModificationException
//        because the iterator’s internal state no longer matches the collection’s structure.

        while(itr.hasNext()) {
            int i=itr.next();
            if(i==10)itr.remove();
            else System.out.println(i);
        }
    }
}
