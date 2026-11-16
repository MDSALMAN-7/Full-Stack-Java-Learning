package com.objectcreation;

public class User {
	String name;
	String userId;
	String mobileNumber;
	
	// static block will get executed just after the class loading.
	static
	{
		System.out.println("I am in SIB ");
	}
	
	public User(String name, String userId, String mobileNumber) {
		
		// First line of Constructor is either super or This();
		super();
		
		System.out.println("User Constructor...");
		this.name = name;
		this.userId = userId;
		this.mobileNumber = mobileNumber;
	}
	
	
}
