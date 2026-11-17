package com.encapsulation.basic1;

public class Payment {
	private int balance;

	public Payment(int balance) {
		super();
		this.balance = balance;
	}
	
	// setter
	public void doDebit(int _amount) {
		if(_amount >0) {
			balance = balance - _amount;
		}
		
	}
	public void doCredit(int _amount) {
		balance = balance + _amount;
	}
	
	// Getter method
	public int getBalance() {
		return balance;
	}
}
