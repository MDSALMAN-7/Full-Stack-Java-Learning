package com.learning.abstraction2;

public class Account {
	public int balance;

	// this method will modify the balance

	public void credit() {
		
//		 logic part 
//		  check the balance of sender
		checkBalance();
//		   check the pin
		validatePin("dsf363");
//		    debit ammount 
//		   credit amount
		 
		System.out.println("Account.credit()... doing fund transfer..");
	}
	
	private int checkBalance() {
		System.out.println("Account.checkBalance()");
		return 2000;
	}
	
	private boolean validatePin(String userId) {
		System.out.println("Account.validatePin()...."+userId);
		return false;
	}
}

