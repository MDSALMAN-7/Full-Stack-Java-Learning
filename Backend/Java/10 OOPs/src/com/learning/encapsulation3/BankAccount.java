package com.learning.encapsulation3;

public class BankAccount {
	private String accountHolder;
	private double balance;
	
	public BankAccount(String accountHolder, double balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public void setName(String name) {
		this.accountHolder = name;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getName() {
		return accountHolder;
	}
	public double getBalance() {
		return balance;
	}
}
