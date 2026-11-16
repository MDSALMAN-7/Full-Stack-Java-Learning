package com.objectcreation;

public class Account {
	String accNum;

	public Account(String accNum) {
		super();
		// call to init block --> IIB
		System.out.println("Account(String accNum)");
		this.accNum = accNum;
		
	}
	
	// Instance init block(SIB) --> this will get executed whenever Object is created
	{
		System.out.println("Account in IIB");
	}
}
