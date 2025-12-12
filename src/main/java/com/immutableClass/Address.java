package com.immutableClass;

import java.util.Objects;

/**
 * Immutable value object for Address.
 * - final class
 * - private final fields
 * - no setters
 * - copy constructor and withers
 */
final class Address {
    private final String street;
    private final String city;

    public Address(String street, String city) {
        this.street = Objects.requireNonNull(street, "street");
        this.city = Objects.requireNonNull(city, "city");
    }

    // Copy constructor for defensive copy patterns
    public Address(Address other) {
        this(other.street, other.city);
    }

    public String getStreet() { return street; }
    public String getCity() { return city; }

    // Withers (return new instance with a change)
    public Address withStreet(String newStreet) { return new Address(newStreet, this.city); }
    public Address withCity(String newCity) { return new Address(this.street, newCity); }

    @Override
    public String toString() {
        return "{street='" + street + "', city='" + city + "'}";
    }
}

