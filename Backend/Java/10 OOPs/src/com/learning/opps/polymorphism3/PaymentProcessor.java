package com.learning.opps.polymorphism3;

public class PaymentProcessor {
	public void processPayment(Payment payment) { // can accept any type of Payment(CreditCard, DebitCard etc) object
		payment.doPayment(); // Polymorphism // Payment payment = new Payment();
	}
}
