package com.vaishnavi.cab.order.booking.utility;

import com.vaishnavi.cab.order.booking.model.Ride;
import java.util.List;
import java.util.stream.Collectors;


public class RideUtility {
    // Filtering rides by status (Completed, Ongoing, etc.)
    public static List<Ride> filterRidesByStatus(List<Ride> rides, String status) {
        return rides.stream()
                .filter(ride -> ride.status().equalsIgnoreCase(status))
                .collect(Collectors.toList());
    }

    // Mapping ride destinations to a list
    public static List<String> getRideDestinations(List<Ride> rides) {
        return rides.stream()
                .map(Ride::dropoffLocation)
                .collect(Collectors.toList());
    }
}
