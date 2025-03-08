package com.vaishnavi.cab.order.booking.repository;

import com.vaishnavi.cab.order.booking.model.User;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class UserRepository {
    private final List<User> users = new ArrayList<>();

    // Adding users
    public void addUser(User user) {
        users.add(user);
    }

    // Get all users
    public List<User> getAllUsers() {
        return users;
    }

    // Find user by email using Stream API
    public Optional<User> findUserByEmail(String email) {
        return users.stream()
                .filter(user -> user.email().equalsIgnoreCase(email))
                .findFirst();
    }

    // Filter users by name containing keyword
    public List<User> filterUsersByName(String keyword) {
        return users.stream()
                .filter(user -> user.name().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }
}
