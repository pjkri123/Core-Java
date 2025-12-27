package com.collections.maps.hashtables;

import java.time.LocalDate;
import java.util.Hashtable;

public class HashtableEg {
    public static void main(String[] args) {
        Hashtable<Integer, Integer> map=new Hashtable<>();
        map.put(10,2);
        map.put(30,6);
        map.put(40,7);
        /** Duplicate keys are allowed logically, but the latest value overwrites the previous one,
         * so put(20,3) replaces put(20,7) */
        map.put(20,7);
        map.put(20,3);
        map.put(8,60);

/** it does not allow null keys or null values because is synchronized (thread-safe),
 * and allowing null would create ambiguity during concurrent operations
 */
//        map.put(null,2);
//        map.put(null,3); //why?
//        map.put(5,null); //why?
//        map.put(6,null);

        System.out.println(map);


        Hashtable<Employee, Integer> employees=new Hashtable<>();

        employees.put(new Employee(1,"Riya","SE",23000, LocalDate.of(2007, 4, 23)),23);
        employees.put(new Employee(3,"Sanaya","ASE",25000, LocalDate.of(2008, 7, 12)),34);
        employees.put(new Employee(4,"Arnav","SE",60000, LocalDate.of(2017, 12, 5)),51);
        employees.put(new Employee(2,"Priya","QA",63000, LocalDate.of(2015, 6, 6)),25);
        employees.put(new Employee(5,"Riya","HR",29000, LocalDate.of(2012, 9, 28)),34);

        System.out.println(employees);

    }
}
