package com.learning.encapsulation;

public class FundTransfer {
	private String accountHolderName;
	private String accountNumber;
	private int balance;
	private int amount;
	
	public FundTransfer(String _accountHolderName, String _accountNumber, int _balance, int _amount) // constructor
	{
		super();
		this.accountHolderName = _accountHolderName;
		this.accountNumber = _accountNumber;
		this.balance = _balance;
		this.amount = _amount;
				
	}
	
	// setter
	public void doDebit(int _amount) {
		// Modifying the data 
		if(balance>=amount) {
			balance = balance - _amount;
		}
	}
	
	public void doCredit(int _amount) {  
		if(_amount>0) {
			// Modifying the data
			balance = balance + _amount;
		}else {
			System.err.println("Amount is less then Balance");
		}
	}
	
	public int getBalance()
	{
		return balance;
	}
}
