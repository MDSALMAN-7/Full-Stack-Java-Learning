package com.learning.string;

public class StringDemo2 {
	public static void main(String[] args) {
//		String fname = "kodewala";
//		String lname = "kodewala";
		String city = new String("Banglore");
		String city1 = new String("Banglore");

		User user1 = new User("Banglore");
		User user2 = new User("Banglore");

//		System.out.println(fname == lname);
		System.out.println(city == city1);
		System.out.println(user1 == user2);
	}
}

class User {
	String name;

	User(String _name) {
		this.name = _name;
	}
}
