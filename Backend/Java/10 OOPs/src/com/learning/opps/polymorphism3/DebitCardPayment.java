package com.learning.opps.polymorphism3;

public class DebitCardPayment extends Payment {
	@Override
	public void doPayment() {
		System.out.println("Payment.doPayment().... Payment");
	}
}
