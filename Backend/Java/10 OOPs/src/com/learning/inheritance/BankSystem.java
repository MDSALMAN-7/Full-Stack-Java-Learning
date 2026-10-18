package com.learning.inheritance;

class AccountNotes // --> parent class
{
	double balance;
	
	// Constructor
	public AccountNotes(double balance)
	{
		this.balance = balance;
	}
	
	// Method to show the balance
	public void showBalance() 
	{
		System.out.println("Account Balance : "+balance);
	}
}

// Child Class inheriting Account using 'extends' keyword
class SavingAccountNotes extends AccountNotes
{
	double interestRate;
	
	// Constructor 
	public SavingAccountNotes(double balance, double interestRate)
	{
		super(balance); // Calling parent Class constructor
		this.interestRate = interestRate;
	}
	
	// Method to calculating interest
	public void calculateInterest() {
		double interest = balance * interestRate/100;
		System.out.println("Interest Earned: "+interest);
	}
}

// Main Class to test Inheritance
public class BankSystem
{
	public static void main(String[] args) {
		SavingAccountNotes sa = new SavingAccountNotes(1000,5); // creating SavingAccount Object
		sa.showBalance(); // inherited method from Account class
		sa.calculateInterest(); // Method From SavingAccount Class
	}
}
  


















