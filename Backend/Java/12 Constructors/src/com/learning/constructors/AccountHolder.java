package com.learning.constructors;

public class AccountHolder {
	// Data
	// these are instance variable
	int amount;
	String account;
	String name;
	String phoneNumber;
	
	// class is nothing it is just a blueprint
	// Constructor --> it will help us to initilize the state of the object(value for instance variable)
	// Constructor will be same as class name
	// Constructor does not have return type
	
	// from here constructor start
	AccountHolder(int _amount, String _account, String _name, String _phoneNumber){ // parametrize constructor
		this.amount = _amount;
		this.account = _account;
		this.name = _name;
		this.phoneNumber = _phoneNumber;
	}
	
}
