package com.abstract1.example;

public class CurrentAccount extends Account {
	CurrentAccount(double balance){
		super(balance);
	}
	
	@Override
	void claculateInterest() {
		System.out.println("No interest for current Account");
	}
}
