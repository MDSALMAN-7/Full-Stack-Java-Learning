package com.learning.constructors2;

public class BankAccount {
	
	String accountHolder;
	String accountNumber;
	double balacne;
	
	public BankAccount(String _accountHolder, String _accountNumber, double _balacne) {
		super();
		this.accountHolder = _accountHolder;
		this.accountNumber = _accountNumber;
		this.balacne = _balacne;
	}
	
	BankAccount(){
		
	}
	

}
