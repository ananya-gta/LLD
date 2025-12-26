package L8_design_parking_lot_system.strategy.concrete_PaymentStrategy;

import L8_design_parking_lot_system.strategy.PaymentStrategy;

public class CashPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cash payment of $" + amount);
    }
}
