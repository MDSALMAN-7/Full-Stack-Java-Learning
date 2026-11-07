package com.accessmodifier.privateexample;

public class ATM {
	private int balance = 10000;
	
	public void checkBalance() {
		System.out.println("Balance :"+getBalance());
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}
