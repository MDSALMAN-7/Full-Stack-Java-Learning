package com.abstract1.example;

// this is parent class
// cannot create an object of this class directly

// Abstract class
abstract class Account {
	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	abstract void claculateInterest(); // Abstract method (To be implemented by subclass)
	
	void showBalance() {
		// concrete method
		System.out.println("Current Balance : "+balance);
	}
}
