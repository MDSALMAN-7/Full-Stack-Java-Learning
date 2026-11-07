package com.accessmodifier.protectedExample.client;

import com.accessmodifier.protectedExample.Employee;

public class Manager extends Employee {

	public Manager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void displayGreeting() {
		// Accessing protected method in the subclass
		sayHello();
	}
	
}
