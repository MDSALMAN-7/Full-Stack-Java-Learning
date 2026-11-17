package com.encapsulation.basic1;

public class Driver {
	public static void main(String[] args) {
		Payment payment = new Payment(1000);
		
//		payment.doCredit(-400);
		payment.doDebit(400);
		
//		payment.balance = 2000;
//		System.out.println(payment.balance);
		
		System.out.println(payment.getBalance());
	}
}
