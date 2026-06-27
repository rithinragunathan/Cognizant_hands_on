package com.cognizant.rithin.AdapterPatternExample;

public class TestClass {

    public static void main(String[] args) {

        PaymentProcessor paypal =
                new PaypalAdapter(new PaypalGateway());

        PaymentProcessor razorpay =
                new RazorpayAdapter(new RazorpayGateway());

        paypal.processPayment(1000);

        razorpay.processPayment(2000);
    }
}