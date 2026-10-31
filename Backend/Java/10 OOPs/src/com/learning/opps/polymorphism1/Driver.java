package com.learning.opps.polymorphism1;

class User {

}

class AdminUser extends User{ // AdminUser IS-S type of User
	
}

public class Driver {
	public static void main(String[] args) {
		User user = new User(); // User class is referring User class object.
		
		AdminUser adminUser = new AdminUser();
		
		User u1 =(User)new AdminUser();  // Parent class can refer child class object  --> auto up-casting 
		
		AdminUser au =(AdminUser) new User(); // Down Casting --> Child class is refering parent class Object
	}
}
