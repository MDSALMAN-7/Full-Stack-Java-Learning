package com.learning.encapsulation;

// This class is not well encapsulated
public class Payment {
	private int balance; // Data or variable   
	
	public Payment(int balance) // constructor
	{
		super();
		this.balance = balance;
	}
	
	// setter
	public void doDebit(int _amount) {
		// Modifying the data 
		balance = balance - _amount;
	}
	
	public void doCredit(int _amount) {  // allow to change the data with the controlled access.
		if(_amount>0) {
			// Modifying the data
			balance = balance + _amount;
		}
	}
	
	public int getBalance()
	{
		return balance;
	}
}

