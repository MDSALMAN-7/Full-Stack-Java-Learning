package com.accessmodifier.privateexample;

public class ATMDriver {
	public static void main(String[] args) {
		ATM atm = new ATM();
//		atm.balance;
		atm.checkBalance();
		atm.getBalance();
	}
}
