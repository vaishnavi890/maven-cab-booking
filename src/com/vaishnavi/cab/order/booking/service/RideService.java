package com.vaishnavi.cab.order.booking.service;

import com.vaishnavi.cab.order.booking.model.Ride;
import com.vaishnavi.cab.order.booking.repository.RideRepository;

import java.util.List;


public class RideService {
    private final RideRepository rideRepository = new RideRepository();

    // Book a ride
    public void bookRide(Ride ride) {
        rideRepository.addRide(ride);
    }

    // Get all rides using Stream API
    public void printAllRides() {
        rideRepository.getAllRides().forEach(ride ->
                System.out.println("Ride: " + ride.rideId() + ", Status: " + ride.status())
        );
    }

    // Get rides by user ID using Stream API
    public void printRidesByUser(int userId) {
        rideRepository.getRidesByUserId(userId).forEach(ride ->
                System.out.println("User Ride: " + ride.rideId() + ", Status: " + ride.status())
        );
    }

    // Get rides by status using Stream API and do-while loop
    public void searchRidesByStatus(String status) {
        do {
            List<Ride> rides = rideRepository.getRidesByStatus(status);
            if (rides.isEmpty()) {
                System.out.println("No rides found with status: " + status);
            } else {
                rides.forEach(ride -> System.out.println("Ride: " + ride.rideId() + ", Status: " + ride.status()));
            }
        } while (false); // Demonstrating do-while
    }

    public void bookRides(List<Ride> list) {
    }
}
