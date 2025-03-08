package com.vaishnavi.cab.order.booking.service;

import com.vaishnavi.cab.order.booking.model.Payment;
import com.vaishnavi.cab.order.booking.repository.PaymentRepository;

import java.util.List;

public class PaymentService {
    private final PaymentRepository paymentRepository = new PaymentRepository();

    // Process a payment
    public void processPayment(Payment payment) {
        paymentRepository.addPayment(payment);
    }

    // Print all payments using Stream API
    public void printAllPayments() {
        paymentRepository.getAllPayments().forEach(payment ->
                System.out.println("Payment ID: " + payment.paymentId() + ", Amount: $" + payment.amount())
        );
    }

    // Get payments by user ID using Stream API
    public void printPaymentsByUser(int userId) {
        paymentRepository.getPaymentsByUserId(userId).forEach(payment ->
                System.out.println("Payment ID: " + payment.paymentId() + ", Amount: $" + payment.amount())
        );
    }

    // Get payments by status using Stream API and do-while loop
    public void searchPaymentsByStatus(String status) {
        do {
            List<Payment> payments = paymentRepository.getPaymentsByStatus(status);
            if (payments.isEmpty()) {
                System.out.println("No payments found with status: " + status);
            } else {
                payments.forEach(payment -> System.out.println("Payment ID: " + payment.paymentId() + ", Status: " + payment.status()));
            }
        } while (false); // Demonstrating do-while
    }

    public void processPayments(List<Payment> list) {
    }
}
