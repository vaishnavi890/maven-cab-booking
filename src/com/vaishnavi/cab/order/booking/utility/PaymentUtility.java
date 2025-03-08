package com.vaishnavi.cab.order.booking.utility;

import com.vaishnavi.cab.order.booking.model.Payment;
import java.util.List;
import java.util.stream.Collectors;

public class PaymentUtility {
    // Filtering payments by status (Successful, Pending, Failed, etc.)
    public static List<Payment> filterPaymentsByStatus(List<Payment> payments, String status) {
        return payments.stream()
                .filter(payment -> payment.status().equalsIgnoreCase(status))
                .collect(Collectors.toList());
    }

    // Getting total revenue from all successful payments
    public static double calculateTotalRevenue(List<Payment> payments) {
        return payments.stream()
                .filter(payment -> payment.status().equalsIgnoreCase("Successful"))
                .mapToDouble(Payment::amount)
                .sum();
    }
}
