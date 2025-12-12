package com.immutableClass;


import java.util.*;
import java.time.LocalDate;

public class ImmutableDemo {
    public static void main(String[] args) {
        Address address = new Address("1st Street", "Bangalore");      // immutable
        List<String> phones = new ArrayList<>(Arrays.asList("12345", "67890"));
        Map<String, String> meta = new HashMap<>();
        meta.put("role", "Engineer");
        Date registeredAt = new Date(); // mutable type

        Employee emp = new Employee(
                "Puja",
                101,
                address,
                phones,
                meta,
                registeredAt,
                LocalDate.of(2024, 1, 1)
        );

        // Try to mutate original inputs after construction (should not affect Employee)
        phones.add("99999");
        meta.put("level", "L2");
        registeredAt.setTime(0L);

        // Try to mutate via getters (should not affect Employee)
        emp.getPhones().add("00000");                 // works on a copy
        emp.getMetadata().put("team", "Platform");    // works on a copy
        emp.getRegisteredAt().setTime(123L);          // works on a copy
        Address leaked = emp.getAddress();            // this is a copy
        Address addr2 = leaked.withCity("Mysuru");    // creates a new Address

        // Print immutable state (unchanged)
        System.out.println(emp.getName());              // Puja
        System.out.println(emp.getId());                // 101
        System.out.println(emp.getAddress());           // {street='1st Street', city='Bangalore'}
        System.out.println(emp.getPhones());            // [12345, 67890]
        System.out.println(emp.getMetadata());          // {role=Engineer}
        System.out.println(emp.getRegisteredAt());      // original date (unchanged)
        System.out.println(emp.getJoinedOn());          // 2024-01-01

        // Demonstrate "with" method creating a new instance (original remains intact)
        Employee promoted = emp.withMetadataEntry("level", "L3");
        System.out.println(emp.getMetadata());          // {role=Engineer}
        System.out.println(promoted.getMetadata());     // {role=Engineer, level=L3}
    }
}