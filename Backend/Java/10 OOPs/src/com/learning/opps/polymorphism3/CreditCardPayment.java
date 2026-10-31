package com.learning.opps.polymorphism3;

public class CreditCardPayment extends Payment
{
	@Override
	public void doPayment() {
		System.out.println("Payment.doPayment().... Payment");
	}
}
