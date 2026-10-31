package com.learning.opps.polymorphism2;

class Payment{
	// Method to be overridden
	void processPayment(double amount) {
		System.out.println("Processing generic payment of "+amount);
	}
}

// Child class UPI payment
class UPIPayment extends Payment
{
	@Override 
	void processPayment(double amount) {
		System.out.println("Processing UPI payment of "+amount);
	}
}

// Child class Credit card payment
class CCPayment extends Payment
{
	@Override 
	void processPayment(double amount) {
		System.out.println("Processing Credit card payment of "+amount);
	}
}

// main class demonstrating Runtime Polymorphism
public class RuntimePloymorphismExample {
	public static void main(String[] args) {
		Payment payment; // Parent reference pointing to different child calss objects
		payment = new UPIPayment(); // processing upi payment
		payment.processPayment(500.75); // calls overridden method in UPI Payment
		
		payment = new CCPayment();
		payment.processPayment(1234.4);// Call overridden method on CCPay
		
	}
}
