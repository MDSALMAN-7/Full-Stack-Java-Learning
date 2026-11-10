package com.learning.constructors.Super;



class SuperUser extends Object{
	SuperUser(){
		
	}
}

public class User extends SuperUser {
	String userName;
	String userId;
	String mobile;
	
	public User(String userName, String userId, String mobile) {
		
		super(); // first line of constructor is either super or this
		this.userName = userName;
		this.userId = userId;
		this.mobile = mobile;
	}
	
	
	
}

