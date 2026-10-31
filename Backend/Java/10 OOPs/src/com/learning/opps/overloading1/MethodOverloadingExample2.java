package com.learning.opps.overloading1;

class Payment
{
	void processPayment(int amount) // method with one parameter (Processing payment by amount)
	{
		System.out.println("Processing payment of $"+amount);
	}
	
	void processPayment(String upiID, int amount) // Method with two parameter (Processing payment using UPI)
	{
		System.out.println("Processing UPI Payment of $ "+amount+ " from UPI ID : "+upiID);
	}
}

public class MethodOverloadingExample2 {
	public static void main(String[] args) {
		Payment payment = new Payment();
		
		payment.processPayment(5000);
		payment.processPayment("Salman@ind",567);
	}
}
