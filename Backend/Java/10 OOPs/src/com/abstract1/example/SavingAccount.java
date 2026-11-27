package com.abstract1.example;

public class SavingAccount extends Account {
	double interestRate = 5.0;

	SavingAccount(double balance){
		super(balance);
	}
	
	@Override
	void claculateInterest() {
		double interest = (balance*interestRate)/100;
		balance += interest;
		System.out.println("Interest added: "+interest);
	}
	
}
