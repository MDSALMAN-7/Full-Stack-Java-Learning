package com.string.Final;

class BankAccount{
	final String accountNumber;

	public BankAccount(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	void display() {
		System.out.println("A/C : "+accountNumber);
	}
	
	
}

public class Bank {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount("911675489376");
		BankAccount ba1 = new BankAccount("911300739376");
		
		ba.display();
		ba1.display();
	}
}
