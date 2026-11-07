package com.accessmodifier.default1.bank;

class BankAccount {
	double balance = 2000;
	
	void showBalance() {
		System.out.println("Show Balance()"+balance);
	}
	
	public double getBalance() {
		return balance;
	}
}
