package com.immutableClass;

import java.time.LocalDate;
import java.util.*;

/**
 * Fully immutable Employee.
 */
final class Employee {
    private final String name;                       // immutable
    private final int id;
    private final Address address;                   // custom immutable value object
    private final List<String> phones;               // defensive copy + unmodifiable
    private final Map<String, String> metadata;      // defensive copy + unmodifiable
    private final Date registeredAt;                 // defensive copy (mutable type)
    private final LocalDate joinedOn;                // immutable (java.time)

    public Employee(String name,
                    int id,
                    Address address,
                    List<String> phones,
                    Map<String, String> metadata,
                    Date registeredAt,
                    LocalDate joinedOn) {

        this.name = Objects.requireNonNull(name, "name");
        this.id = id;

        // Defensive copy of custom object (Address is already immutable, but copying keeps the rule generic)
        this.address = new Address(Objects.requireNonNull(address, "address"));

        // Defensive copies of collections + unmodifiable wrappers
        List<String> phonesCopy = new ArrayList<>(Objects.requireNonNull(phones, "phones"));
        this.phones = Collections.unmodifiableList(phonesCopy);

        Map<String, String> metaCopy = new HashMap<>(Objects.requireNonNull(metadata, "metadata"));
        this.metadata = Collections.unmodifiableMap(metaCopy);

        // Defensive copy of mutable Date
        Date tmp = Objects.requireNonNull(registeredAt, "registeredAt");
        this.registeredAt = new Date(tmp.getTime());

        this.joinedOn = Objects.requireNonNull(joinedOn, "joinedOn");
    }

    // No setters — read-only accessors that never expose internal mutable objects

    public String getName() { return name; }
    public int getId() { return id; }

    /** Returns a copy to avoid leaking internal reference (rule applies even if Address is immutable). */
    public Address getAddress() { return new Address(address); }

    /** Return a copy so caller mutations don’t affect internal state. */
    public List<String> getPhones() { return new ArrayList<>(phones); }

    /** Return a copy so caller mutations don’t affect internal state. */
    public Map<String, String> getMetadata() { return new HashMap<>(metadata); }

    /** Return a defensive copy of Date (mutable). */
    public Date getRegisteredAt() { return new Date(registeredAt.getTime()); }

    public LocalDate getJoinedOn() { return joinedOn; }

    // Optional “with” methods — return NEW instances instead of mutating state
    public Employee withMetadataEntry(String key, String value) {
        Map<String, String> newMeta = new HashMap<>(this.metadata);
        newMeta.put(key, value);
        return new Employee(this.name, this.id, this.address, this.phones, newMeta, this.registeredAt, this.joinedOn);
    }

    public Employee withPhoneAdded(String phone) {
        List<String> newPhones = new ArrayList<>(this.phones);
        newPhones.add(phone);
        return new Employee(this.name, this.id, this.address, newPhones, this.metadata, this.registeredAt, this.joinedOn);
    }

    public Employee withAddress(Address newAddress) {
        return new Employee(this.name, this.id, new Address(newAddress), this.phones, this.metadata, this.registeredAt, this.joinedOn);
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + ", address=" + address + "}";
    }
}