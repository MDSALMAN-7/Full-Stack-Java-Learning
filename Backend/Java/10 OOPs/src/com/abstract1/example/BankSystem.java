package com.abstract1.example;

public class BankSystem {

	public static void main(String[] args) {
		Account saving = new SavingAccount(10000);
		saving.showBalance();
		saving.claculateInterest();
		saving.showBalance();
		
		Account current = new CurrentAccount(150000);
		
		current.showBalance();
		current.claculateInterest();
		current.showBalance();
	}

}
    