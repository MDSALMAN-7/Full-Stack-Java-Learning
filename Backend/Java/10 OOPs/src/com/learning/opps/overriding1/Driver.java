package com.learning.opps.overriding1;

public class Driver {
	public static void main(String[] args) {
		Account acc = new Account();
		
		acc.openAccount("Salman", 1234);
		
		SavingAccount savAcc = new SavingAccount();
		savAcc.openAccount("Kamdev", 567);
		
	}
}
