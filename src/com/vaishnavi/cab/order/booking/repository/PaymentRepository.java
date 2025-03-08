package com.vaishnavi.cab.order.booking.repository;

import com.vaishnavi.cab.order.booking.model.Payment;
import java.util.*;
import java.util.stream.Collectors;

public class PaymentRepository {
    private final List<Payment> payments = new ArrayList<>();

    // Add a new payment
    public void addPayment(Payment payment) {
        payments.add(payment);
    }

    // Get all payments
    public List<Payment> getAllPayments() {
        return payments;
    }

    // Find payments by user ID
    public List<Payment> getPaymentsByUserId(int userId) {
        return payments.stream()
                .filter(payment -> payment.userId() == userId)
                .collect(Collectors.toList());
    }

    // Find payments by ride ID
    public List<Payment> getPaymentsByRideId(int rideId) {
        return payments.stream()
                .filter(payment -> payment.rideId() == rideId)
                .collect(Collectors.toList());
    }

    // Find payments by status (e.g., "Completed", "Pending")
    public List<Payment> getPaymentsByStatus(String status) {
        return payments.stream()
                .filter(payment -> payment.status().equalsIgnoreCase(status))
                .collect(Collectors.toList());
    }
}
