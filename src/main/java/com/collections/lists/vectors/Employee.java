package com.collections.lists.vectors;


import java.time.LocalDate;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String role;
    private double salary;
    private LocalDate doj;

    public Employee() {
    }

    public Employee(int id, String name, String role, double salary, LocalDate doj) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.doj = doj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    @Override
    public int compareTo(Employee e) {
//        return this.id-e.getId();
//        return this.name.compareTo(e.getName());
        return this.doj.compareTo(e.doj);
    }

    @Override
    public boolean equals(Object o) {
        if(this==o) return true;
        if(!(o instanceof Employee e)) return false;
        return this.id==e.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                ", doj=" + doj +
                '}'+"\n";
    }
}
