package com.vaishnavi.cab.order.booking.utility;

import com.vaishnavi.cab.order.booking.model.Rating;
import java.util.List;
import java.util.stream.Collectors;

public class RatingUtility {
    // Filtering ratings by minimum score
    public static List<Rating> filterRatingsByScore(List<Rating> ratings, int minScore) {
        return ratings.stream()
                .filter(rating -> rating.rating() >= minScore)
                .collect(Collectors.toList());
    }

    // Getting all reviews from ratings
    public static List<String> getAllReviews(List<Rating> ratings) {
        return ratings.stream()
                .map(Rating::review)
                .collect(Collectors.toList());
    }
}
