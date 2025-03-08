package com.vaishnavi.cab.order.booking.repository;

import com.vaishnavi.cab.order.booking.model.Ride;
import java.util.*;
import java.util.stream.Collectors;

public class RideRepository {
    private final List<Ride> rides = new ArrayList<>();

    // Add a new ride
    public void addRide(Ride ride) {
        rides.add(ride);
    }

    // Get all rides
    public List<Ride> getAllRides() {
        return rides;
    }

    // Find rides by user ID
    public List<Ride> getRidesByUserId(int userId) {
        return rides.stream()
                .filter(ride -> ride.userId() == userId)
                .collect(Collectors.toList());
    }

    // Find rides by driver ID
    public List<Ride> getRidesByDriverId(int driverId) {
        return rides.stream()
                .filter(ride -> ride.driverId() == driverId)
                .collect(Collectors.toList());
    }

    // Find rides by status (e.g., "Completed", "Ongoing")
    public List<Ride> getRidesByStatus(String status) {
        return rides.stream()
                .filter(ride -> ride.status().equalsIgnoreCase(status))
                .collect(Collectors.toList());
    }
}
