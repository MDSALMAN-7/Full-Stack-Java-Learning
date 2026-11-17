package com.encapsulation.basic1;

public class FundTransfer {
	private String accountHolderName;
	private String accountNumber;
	private int balance;
	private int amount;

	public FundTransfer(String accountHolderName, String accountNumber, int balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void doDebit(int _amount) {
		if (_amount > 0 && _amount <= balance) {
			balance = balance - _amount;
		}
	}
	
	// getter
	public int getBalance() {
		return balance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

}
