package com.learning.constructors;

public class AccountHolder {
	// Data
	int amount;
	String account;
	String name;
	String phoneNumber;
	
	// Constructor --> it will help us to initilize the state of the object(value for instance variable)
	// Constructor will be same as class name
	// Constructor does not have return type
	
	
	AccountHolder(int _amount, String _account, String _name, String _phoneNumber){
		this.amount = _amount;
		this.account = _account;
		this.name = _name;
		this.phoneNumber = _phoneNumber;
	}
	
}
