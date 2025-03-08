package com.vaishnavi.cab.order.booking.model;

public record Ride(int rideId, int userId, int driverId, String pickupLocation, String dropoffLocation, double fare, String status) {}
