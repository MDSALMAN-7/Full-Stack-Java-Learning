package com.learning.encapsulation;

public class PaymentDriver {
	public static void main(String[] args) {
		Payment payment = new Payment(12200);
//		payment.balance = 200000;
		payment.doDebit(2000);
		payment.doCredit(12000);
		payment.getBalance();
		System.out.println(payment.getBalance());
		
	}
}

