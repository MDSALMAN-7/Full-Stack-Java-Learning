package com.accessmodifier.privateexample;

public class Main {
	public static void main(String[] args) {
		// Creating an object object of BankAccount class
		
		BankAccount acc = new BankAccount();
		
		// Accessing the public method to deposit money
		acc.deposit(1234);
		
		// Accessing the public method to get the balance
		System.out.println("Balance: "+acc.getBalance());
		
		// the following lines will cause a compile-time error
//		acc.balance = 5000; // cannot access data member
//		acc.updateBalance(5000);  // Cannot access private method
		
	}
}
