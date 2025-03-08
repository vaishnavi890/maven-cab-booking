package com.vaishnavi.cab.order.booking.service;

import com.vaishnavi.cab.order.booking.model.Rating;
import com.vaishnavi.cab.order.booking.repository.RatingRepository;

import java.util.List;

public class RatingService {
    private final RatingRepository ratingRepository = new RatingRepository();

    // Add a rating
    public void addRating(Rating rating) {
        ratingRepository.addRating(rating);
    }

    // Print all ratings using Stream API
    public void printAllRatings() {
        ratingRepository.getAllRatings().forEach(rating ->
                System.out.println("Rating: " + rating.rating() + ", Review: " + rating.review())
        );
    }

    // Get ratings by driver ID using Stream API
    public void printRatingsByDriver(int driverId) {
        ratingRepository.getRatingsByDriverId(driverId).forEach(rating ->
                System.out.println("Driver Rating: " + rating.rating() + ", Review: " + rating.review())
        );
    }

    // Get average rating for a driver using Stream API and do-while loop
    public void calculateAverageRating(int driverId) {
        do {
            double average = ratingRepository.getAverageRatingForDriver(driverId);
            if (average == 0.0) {
                System.out.println("No ratings available for this driver.");
            } else {
                System.out.println("Average Rating for Driver " + driverId + ": " + average);
            }
        } while (false); // Demonstrating do-while
    }

    public void addRatings(List<Rating> list) {
    }
}
