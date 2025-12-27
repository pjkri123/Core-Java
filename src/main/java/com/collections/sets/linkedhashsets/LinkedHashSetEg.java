package com.collections.sets.linkedhashsets;

import java.time.LocalDate;
import java.util.LinkedHashSet;

public class LinkedHashSetEg {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(30);
        set.add(40);
        set.add(20);
        set.add(20);
        set.add(null);

        System.out.println(set);

        LinkedHashSet<Employee> employees = new LinkedHashSet<>();

        employees.add(new Employee(1, "Riya", "SE", 23000, LocalDate.of(2007, 4, 23)));
        employees.add(new Employee(3, "Sanaya", "ASE", 25000, LocalDate.of(2008, 7, 12)));
        employees.add(new Employee(4, "Arnav", "SE", 60000, LocalDate.of(2017, 12, 5)));
        employees.add(new Employee(2, "Priya", "QA", 63000, LocalDate.of(2015, 6, 6)));
        employees.add(new Employee(5, "Riya", "HR", 29000, LocalDate.of(2012, 9, 28)));

        System.out.println(employees);
    }
}
