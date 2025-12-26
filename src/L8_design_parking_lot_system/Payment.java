package L8_design_parking_lot_system;

import L8_design_parking_lot_system.strategy.PaymentStrategy;

public class Payment {
    private double amount;
    private PaymentStrategy paymentStrategy;

    public Payment(double amount, PaymentStrategy paymentStrategy) {
        this.amount = amount;
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment() {
        if (amount > 0) {
            paymentStrategy.processPayment(amount);
        } else {
            System.out.println("Invalid payment amount.");
        }
    }
}
