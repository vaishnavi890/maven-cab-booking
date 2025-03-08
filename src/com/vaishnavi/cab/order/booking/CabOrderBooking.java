package com.vaishnavi.cab.order.booking;

import com.vaishnavi.cab.order.booking.controller.*;
import com.vaishnavi.cab.order.booking.model.*;
import com.vaishnavi.cab.order.booking.utility.*;

import java.util.Arrays;
import java.util.List;

public class CabOrderBooking {
    public static void main(String[] args) {
        // -------------------- Initializing Controllers --------------------
        UserController userController = new UserController();
        DriverController driverController = new DriverController();
        RideController rideController = new RideController();
        PaymentController paymentController = new PaymentController();
        RatingController ratingController = new RatingController();

        // -------------------- Adding Data through Controllers --------------------
        System.out.println("\n Registering Users...");
        userController.addUser();

        System.out.println("\n Registering Drivers...");
        driverController.addDrivers();

        System.out.println("\n Booking Rides...");
        rideController.addRides();

        System.out.println("\n Processing Payments...");
        paymentController.addPayments();

        System.out.println("\n Adding Ratings...");
        ratingController.addRatings();

        // -------------------- Using Utility Functions --------------------
        List<User> users = Arrays.asList(
                new User(1, "John Doe", "john@example.com", "1234567890"),
                new User(2, "Alice Smith", "alice@example.com", "9876543210")
        );

        List<Driver> drivers = Arrays.asList(
                new Driver(1, "Bob Johnson", "bob@example.com", "1112223333", "Sedan"),
                new Driver(2, "Charlie Brown", "charlie@example.com", "4445556666", "SUV")
        );

        List<Ride> rides = Arrays.asList(
                new Ride(101, 1, 1, "Location A", "Location B", 50.0, "Completed"),
                new Ride(102, 2, 2, "Location C", "Location D", 70.0, "Ongoing")
        );

        List<Payment> payments = Arrays.asList(
                new Payment(201, 101, 1, 50.0, "Credit Card", "Successful"),
                new Payment(202, 102, 2, 70.0, "PayPal", "Pending")
        );

        List<Rating> ratings = Arrays.asList(
                new Rating(301, 101, 1, 1, 5, "Great experience!"),
                new Rating(302, 102, 2, 2, 4, "Good but can improve.")
        );

        // -------------------- Utility Layer Operations --------------------
        System.out.println("\n Sorted Users by Name:");
        UserUtility.sortUsersByName(users).forEach(user -> System.out.println(user.name()));

        System.out.println("\n Driver Names:");
        DriverUtility.getDriverNames(drivers).forEach(System.out::println);

        System.out.println("\n Completed Rides:");
        RideUtility.filterRidesByStatus(rides, "Completed").forEach(ride -> System.out.println(ride.rideId()));

        System.out.println("\n Total Revenue:");
        System.out.println(PaymentUtility.calculateTotalRevenue(payments));

        System.out.println("\n Ratings above 4:");
        RatingUtility.filterRatingsByScore(ratings, 4).forEach(rating -> System.out.println(rating.rating()));

        System.out.println("\n Program Execution Completed.");
    }
}
