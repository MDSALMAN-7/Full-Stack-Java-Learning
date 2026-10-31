package com.learning.opps.polymorphism3;

// assume that i added this class after two years
public class UPIPayment extends Payment
{
	@Override
	public void doPayment() {
		System.out.println("UPIPayment.doPayment()... UPI Payment");
	}
}
