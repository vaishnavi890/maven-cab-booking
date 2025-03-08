package com.vaishnavi.cab.order.booking.repository;

import com.vaishnavi.cab.order.booking.model.Driver;
import java.util.*;
import java.util.stream.Collectors;

public class DriverRepository {
    private final List<Driver> drivers = new ArrayList<>();

    // Add a new driver
    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    // Get all drivers
    public List<Driver> getAllDrivers() {
        return drivers;
    }

    // Find driver by email
    public Optional<Driver> findDriverByEmail(String email) {
        return drivers.stream()
                .filter(driver -> driver.email().equalsIgnoreCase(email))
                .findFirst();
    }

    // Filter drivers based on cab type
    public List<Driver> filterDriversByCabType(String cabType) {
        return drivers.stream()
                .filter(driver -> driver.cabDetails().toLowerCase().contains(cabType.toLowerCase()))
                .collect(Collectors.toList());
    }

    public Iterable<Object> getDriversByCabType(String cabType) {
        return null;
    }
}
