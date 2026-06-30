package com.cognizant.rithin.AdapterPatternExample;

public class PaypalAdapter implements PaymentProcessor{
    private PaypalGateway paypalGateway;
    public PaypalAdapter(PaypalGateway paypalGateway) {
        this.paypalGateway = paypalGateway;
    }
    @Override
    public void processPayment(double amount) {
        paypalGateway.payAmount(amount);
    }
}
