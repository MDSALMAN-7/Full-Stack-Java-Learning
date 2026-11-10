package com.learning.constructors.This;

class UserDetails{
	String accountNumber;
	int balance;
	
	public UserDetails(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void displayDetails() {
		System.out.println("Account Number : "+balance);
		System.out.println("Balance : "+balance);
	}
	
}

public class BankAccount {
	public static void main(String[] args) {
		UserDetails user = new UserDetails("09876544567", 100235);
		UserDetails user1 = new UserDetails("09876546834", 170285);
		
		user.displayDetails();
		user1.displayDetails();
	}
}
