package com.vaishnavi.cab.order.booking.controller;

import com.vaishnavi.cab.order.booking.functionality.EntityProcessor;
import com.vaishnavi.cab.order.booking.model.Ride;
import com.vaishnavi.cab.order.booking.service.RideService;

import java.util.Arrays;

public class RideController {
    private final RideService rideService = new RideService();

    public void addRides() {
        Ride ride1 = new Ride(101, 1, 1, "Point A", "Point B", 50.0, "Completed");
        Ride ride2 = new Ride(102, 2, 2, "Point C", "Point D", 70.0, "Ongoing");

        rideService.bookRides(Arrays.asList(ride1, ride2));

        // Using lambda expression with Functional Interface
        EntityProcessor<Ride> processor = ride ->
                System.out.println("Processing ride: " + ride.rideId());

        processor.process(ride1);

        rideService.printAllRides();
    }
}
