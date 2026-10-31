package com.learning.opps.polymorphism3;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PaymentProcessor paymentProcesser = new PaymentProcessor();
		
		// for the user#1, he/she selected payment method as a credit card
		CreditCardPayment ccp = new CreditCardPayment();
		
		paymentProcesser.processPayment(ccp);
		
		// for the user#2, he/she selected payment method as a Net Banking System
		NetBankingPayment netPayment = new NetBankingPayment();
		paymentProcesser.processPayment(netPayment);
		
		// for the user#3, he/she selected payment method as UPI Payment
		UPIPayment upiPayment = new UPIPayment();
		paymentProcesser.processPayment(upiPayment);

	}

}
