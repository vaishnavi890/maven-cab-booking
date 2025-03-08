package com.vaishnavi.cab.order.booking.controller;

import com.vaishnavi.cab.order.booking.functionality.EntityProcessor;
import com.vaishnavi.cab.order.booking.model.User;
import com.vaishnavi.cab.order.booking.service.UserService;
import java.util.Arrays;

    public class UserController {
        private final UserService userService = new UserService();

        public void addUser() {
            User user1 = new User(1, "John Doe", "john@example.com", "1234567890");
            User user2 = new User(2, "Jane Smith", "jane@example.com", "0987654321");

            userService.registerUsers(Arrays.asList(user1, user2));

            // Using lambda expression with Functional Interface
            EntityProcessor<User> processor = user ->
                    System.out.println("Processing user: " + user.name());

            processor.process(user1);

            userService.printAllUsers();
        }
}
