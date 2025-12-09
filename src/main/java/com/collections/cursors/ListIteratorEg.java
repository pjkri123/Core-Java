package com.collections.cursors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEg {
    public static void main(String[] args) {
        List<Integer> lists=new ArrayList<>();
        lists.add(10);
        lists.add(20);
        lists.add(30);

        ListIterator<Integer> itr=lists.listIterator();

        while(itr.hasNext()) {
            Integer i=itr.next();
            if(i==10) itr.remove();
            else System.out.println(i);
            System.out.println(itr.nextIndex());
        }

        while(itr.hasPrevious()) {
            System.out.println(itr.previousIndex());
            Integer i=itr.previous();
            if(i==20) itr.add(10);
            if(i==30) itr.set(40); //replaces the last element returned by next() or previous() in the list, not the variable i.
//            The variable i already holds the old value (30) because you retrieved it before calling set().
//            Printing i will still show 30 because i is not automatically updated when the list changes.

            System.out.println(i);
        }

        System.out.println(lists);



        List<Integer> list2 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        // Start at index 2 (element 30)
        ListIterator<Integer> itr2 = list2.listIterator(2);

        // Forward from index 2: prints 30, 40, 50
        while (itr2.hasNext()) {
            System.out.println("next: " + itr2.next());
        }

        System.out.println("Final list: " + list2);



        List<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        // Position at index 3 (element 40 will be next)
        ListIterator<Integer> itr1 = list1.listIterator(3);

        // Move backward: prints 30, 20, 10
        while (itr1.hasPrevious()) {
            System.out.println("previous: " + itr1.previous());
        }
    }

}

