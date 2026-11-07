package com.accessmodifier.privateexample;

public class BankAccount {
	// Private data member
	private double balance;
	
	// Private method
	private void updateBalance(double amount) {
		this.balance += amount;
	}
	
	//Public method to access the private method
	public void deposit(double amount) {
		if(amount>0) {
			updateBalance(amount); // Accesing private method within the class 
			System.out.println("Deposit successful, Current Bal: "+balance);
		}
	}
	
	public double getBalance() {
		return balance;
	}
	 
}	
