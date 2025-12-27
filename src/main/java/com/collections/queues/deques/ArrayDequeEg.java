package com.collections.queues.deques;

import java.time.LocalDate;
import java.util.ArrayDeque;

public class ArrayDequeEg {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque=new ArrayDeque<>();
        deque.add(10);
        deque.add(30);
        deque.add(40);
        deque.add(20);
        deque.add(20);
        deque.addFirst(90);
        deque.addLast(39);

//        deque.add(null); it does not allow null elements

        System.out.println(deque);

        while(!deque.isEmpty()) System.out.println(deque.poll());

        ArrayDeque<Employee> employees=new ArrayDeque<>();

        employees.add(new Employee(1,"Riya","SE",23000, LocalDate.of(2007, 4, 23)));
        employees.add(new Employee(3,"Sanaya","ASE",25000, LocalDate.of(2008, 7, 12)));
        employees.add(new Employee(4,"Arnav","SE",60000, LocalDate.of(2017, 12, 5)));
        employees.add(new Employee(2,"Priya","QA",63000, LocalDate.of(2015, 6, 6)));
        employees.add(new Employee(5,"Riya","HR",29000, LocalDate.of(2012, 9, 28)));

        System.out.println(employees);

        while(!employees.isEmpty()) System.out.println(employees.poll());

    }
}
