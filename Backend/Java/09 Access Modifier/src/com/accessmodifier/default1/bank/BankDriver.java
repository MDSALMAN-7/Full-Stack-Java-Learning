package com.accessmodifier.default1.bank;

public class BankDriver {
	public static void main(String[] args) {
		BankAccount bacc = new BankAccount();
		bacc.showBalance();
		double blance =bacc.getBalance();
		System.out.println("Balance"+blance);;
		
	}
}
