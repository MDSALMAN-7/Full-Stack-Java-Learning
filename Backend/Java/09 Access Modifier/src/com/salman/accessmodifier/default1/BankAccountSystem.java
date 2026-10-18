package com.salman.accessmodifier.default1;

class BankAccountSystem {
	String accountHolder;
	double balance = 56075;
	
	void deposit(double amount) {
		balance = balance + amount;
	}
	
	void showBalance() {
		System.out.println("Name : "+accountHolder);
		System.out.println("Balance : "+balance);
	}
}
