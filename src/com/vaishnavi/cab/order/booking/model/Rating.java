package com.vaishnavi.cab.order.booking.model;

public record Rating (int ratingId, int rideId, int userId, int driverId, int rating, String review) {}
