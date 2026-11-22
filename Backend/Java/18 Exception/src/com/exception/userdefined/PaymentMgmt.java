package com.exception.userdefined;

import javax.naming.InsufficientResourcesException;

public class PaymentMgmt {
	public void doPayment(String account, int amount) {
		// Check the balance
		try {
			checkBalance(account,amount);
		} catch (InsufficientBalanceException e) {
			throw new FundTransferException("You do not enau");
		}
	}
	
	private boolean checkBalance(String account, int balance) {
		boolean checkBalanceStatus = false;
		int balance = 1000; // from database
		
		if(amount>balance) {
			
		}
	}
}
