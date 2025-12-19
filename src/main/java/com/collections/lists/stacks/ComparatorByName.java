package com.collections.lists.stacks;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
//        return e1.getId()-e2.getId();
        return e1.getName().compareTo(e2.getName());
    }
}
