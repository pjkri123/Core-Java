package com.collections.lists.stacks;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Stack;

public class StackEg {
    public static void main(String[] args) {
        Stack<Integer> list=new Stack<>();
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(20);

        System.out.println(list);

        Stack<Employee> employees=new Stack<>();

        employees.add(new Employee(1,"Riya","SE",23000, LocalDate.of(2007, 4, 23)));
        employees.add(new Employee(3,"Sanaya","ASE",25000, LocalDate.of(2008, 7, 12)));
        employees.add(new Employee(4,"Arnav","SE",60000, LocalDate.of(2017, 12, 5)));
        employees.add(new Employee(2,"Priya","QA",63000, LocalDate.of(2015, 6, 6)));
        employees.add(new Employee(5,"Riya","HR",29000, LocalDate.of(2012, 9, 28)));

        System.out.println(employees);

        System.out.println(employees.peek());
        System.out.println(employees.pop());

        System.out.println("Sorting......");

        Collections.sort(employees);

        System.out.println(employees);

        System.out.println("using comparator.......");
//        Collections.sort(employees,new ComparatorByName());
        employees.sort(new ComparatorByName());

        System.out.println(employees);

        System.out.println(employees.peek());
        System.out.println(employees.pop());

        employees.push(new Employee(6,"Eisha","ASE",28000, LocalDate.of(2017, 12, 13)));
        System.out.println("pushed new employee.....");
        System.out.println(employees);
    }
}
