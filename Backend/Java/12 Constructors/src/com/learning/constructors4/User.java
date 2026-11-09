package com.learning.constructors4;

class SuperUser{
	
}

public class User extends SuperUser {
	String userName;
	String userId;
	String mobile;
	
	public User(String userName, String userId, String mobile) {
		this(39); // calling same class (User Constructor)
		this.userName = userName;
		this.userId = userId;
		this.mobile = mobile;
	}
	
	User(int age){
		System.out.println("User() ..No arg"+age);
	}
	
}
