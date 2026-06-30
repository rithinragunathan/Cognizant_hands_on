package com.cognizant.rithin.AdapterPatternExample;

public class RazorpayAdapter implements PaymentProcessor{
    private RazorpayGateway razorpayGateway;
    public RazorpayAdapter(RazorpayGateway razorpayGateway) {
        this.razorpayGateway = razorpayGateway;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println(amount);
    }
}
