package com.learning.constructor5;

public class User {
	String name;
	String type;
	String country;
	
	
	public User(String name, String type, String country) {
		this.name = name;
		this.type = type;
		this.country = country;
	}
	
	public User() {
		this("Salman", "Guest_User", "IN");  // Calling User class constructor	
	}
	
}
