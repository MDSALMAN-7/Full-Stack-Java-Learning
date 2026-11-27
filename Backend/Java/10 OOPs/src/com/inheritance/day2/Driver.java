package com.inheritance.day2;

class Account {
	public void openAccount() {
		System.out.println("Account.openAccount()...");
	}
}

class SavingAccount extends Account {
	@Override // changing the super class method's functionalities
	public void openAccount() {
		System.out.println("SavingAccount.openAccount()...");
	}
}

class SrCitAccount extends SavingAccount {
	@Override
	public void openAccount() {
		System.out.println("SrCitAccount.openAccount()...");
	}
}

class PensionAccount extends SrCitAccount {
	@Override
	public void openAccount() {
		System.out.println("PensionAccount.openAccount()...");
	}
}

public class Driver {
	public static void main(String[] args) {
		PensionAccount pacc = new PensionAccount();
		pacc.openAccount();

	}
}
