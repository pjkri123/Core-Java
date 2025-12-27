package com.collections.maps.treemaps;

import java.time.LocalDate;
import java.util.*;

public class TreeMapEg {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> map=new TreeMap<>();
        map.put(10,2);
        map.put(30,6);
        map.put(40,7);
        map.put(20,7);
        map.put(20,3); //it allows duplicate key logically but the latest value overwrites the previous one
        map.put(8,60);
//        map.put(null,2);
//        map.put(null,3); //it doesn't allow null key because it stores keys in sorted order
        map.put(5,null); //it allows null values
        map.put(6,null);

        /**
         * Why TreeMap can’t sort by values directly
         *
         * TreeMap is implemented using a Red-Black Tree
         *
         * The tree structure depends only on keys
         *
         * Values are not part of ordering logic
         *
         * Therefore, sorting by values requires external sorting
         */

        System.out.println(map);

        // Convert entries to map
        List<Map.Entry<Integer, Integer>> list1 =
                new ArrayList<>(map.entrySet());

// Sort by values (nulls last)
        list1.sort(Comparator.comparing(
                Map.Entry::getValue,
                Comparator.nullsLast(Integer::compareTo)
        ));

        System.out.println(list1);

        TreeMap<Employee, Integer> employees=new TreeMap<>();

        employees.put(new Employee(1,"Riya","SE",23000, LocalDate.of(2007, 4, 23)),25);
        employees.put(new Employee(3,"Sanaya","ASE",25000, LocalDate.of(2008, 7, 12)),43);
        employees.put(new Employee(4,"Arnav","SE",60000, LocalDate.of(2017, 12, 5)),25);
        employees.put(new Employee(2,"Priya","QA",63000, LocalDate.of(2015, 6, 6)),34);
        employees.put(new Employee(5,"Riya","HR",29000, LocalDate.of(2012, 9, 28)),36);

        System.out.println(employees);

    }
}
