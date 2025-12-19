package com.collections.queues.priorityQueues;

import java.time.LocalDate;
import java.util.PriorityQueue;

public class PriorityQueueEg {
    public static void main(String[] args) {
        PriorityQueue<Integer> list=new PriorityQueue<>();
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(20);
        list.add(20);

        System.out.println(list); //heap order, not sorted order

//        list.peek(); // it will give the smallest element
        while(!list.isEmpty()) System.out.println(list.poll());

        PriorityQueue<Employee> employees=new PriorityQueue<>();

        employees.add(new Employee(1,"Riya","SE",23000, LocalDate.of(2007, 4, 23)));
        employees.add(new Employee(3,"Sanaya","ASE",25000, LocalDate.of(2008, 7, 12)));
        employees.add(new Employee(4,"Arnav","SE",60000, LocalDate.of(2017, 12, 5)));
        employees.add(new Employee(2,"Priya","QA",63000, LocalDate.of(2015, 6, 6)));
        employees.add(new Employee(5,"Riya","HR",29000, LocalDate.of(2012, 9, 28)));

        System.out.println(employees);

//        employees.peek();

        while(!employees.isEmpty()) System.out.println(employees.poll());

        System.out.println("------------------------------------");

        PriorityQueue<Employee> employees1=new PriorityQueue<>(new ComparatorByName());

        employees1.add(new Employee(1,"Riya","SE",23000, LocalDate.of(2007, 4, 23)));
        employees1.add(new Employee(3,"Sanaya","ASE",25000, LocalDate.of(2008, 7, 12)));
        employees1.add(new Employee(4,"Arnav","SE",60000, LocalDate.of(2017, 12, 5)));
        employees1.add(new Employee(2,"Priya","QA",63000, LocalDate.of(2015, 6, 6)));
        employees1.add(new Employee(5,"Riya","HR",29000, LocalDate.of(2012, 9, 28)));

        while(!employees1.isEmpty()) System.out.println(employees1.poll());
    }
}
