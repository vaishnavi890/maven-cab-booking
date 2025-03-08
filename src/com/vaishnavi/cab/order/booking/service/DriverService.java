package com.vaishnavi.cab.order.booking.service;

import com.vaishnavi.cab.order.booking.model.Driver;
import com.vaishnavi.cab.order.booking.repository.DriverRepository;

import java.util.List;
import java.util.Optional;

public class DriverService {
    private final DriverRepository driverRepository = new DriverRepository();

    // Register a driver
    public void registerDriver(Driver driver) {
        driverRepository.addDriver(driver);
    }

    // Get all drivers using Stream API
    public void printAllDrivers() {
        driverRepository.getAllDrivers().forEach(driver ->
                System.out.println("Driver: " + driver.name() + ", Cab: " + driver.cabDetails())
        );
    }

    // Find a driver by email using Stream API
    public void searchDriverByEmail(String email) {
        do {
            Optional<Driver> driver = driverRepository.findDriverByEmail(email);
            driver.ifPresentOrElse(
                    d -> System.out.println("Driver Found: " + d.name()),
                    () -> System.out.println("Driver not found!")
            );
        } while (false); // Just to demonstrate do-while
    }

    // Filter drivers by cab type using Stream API
    public void printDriversByCabType(String cabType) {

    }

    public void registerDrivers(List<Driver> list) {
    }
}
