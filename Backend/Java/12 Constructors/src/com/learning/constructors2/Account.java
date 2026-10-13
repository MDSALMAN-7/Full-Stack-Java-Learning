package com.learning.constructors2;

public class Account {
	int amount;
	String name;

	// if developer is not providing any constructor in class then compiler will add
	// default constructor(no argc constructor)
	
	Account(){
		System.out.println("Inside Account()");
	}
	Account(int _amount, String _name){
		System.out.println("Inside Account(int _amount, String _name)");
		this.amount = _amount;
		this.name = _name;
	}

}