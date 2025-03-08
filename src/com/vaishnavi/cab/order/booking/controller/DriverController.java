package com.vaishnavi.cab.order.booking.controller;

import com.vaishnavi.cab.order.booking.functionality.EntityProcessor;
import com.vaishnavi.cab.order.booking.model.Driver;
import com.vaishnavi.cab.order.booking.service.DriverService;

import java.util.Arrays;


public class DriverController {
    private final DriverService driverService = new DriverService();

    public void addDrivers() {
        Driver driver1 = new Driver(1, "Alice Johnson", "alice@example.com", "1112223333", "Sedan");
        Driver driver2 = new Driver(2, "Bob Williams", "bob@example.com", "4445556666", "SUV");

        driverService.registerDrivers(Arrays.asList(driver1, driver2));

        // Using lambda expression with Functional Interface
        EntityProcessor<Driver> processor = driver ->
                System.out.println("Processing driver: " + driver.name());

        processor.process(driver1);

        driverService.printAllDrivers();
    }
}
