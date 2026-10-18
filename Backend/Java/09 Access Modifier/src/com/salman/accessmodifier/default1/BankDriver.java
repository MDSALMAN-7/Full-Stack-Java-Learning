package com.salman.accessmodifier.default1;

public class BankDriver {
	public static void main(String[] args) {
		BankAccountSystem bas = new BankAccountSystem();
		bas.accountHolder = "Salman";
		bas.deposit(1000);
		bas.showBalance();
	}
}
