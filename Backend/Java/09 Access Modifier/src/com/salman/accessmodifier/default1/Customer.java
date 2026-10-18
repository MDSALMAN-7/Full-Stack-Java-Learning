package com.salman.accessmodifier.default1; // Package

// Default access modifier example
class Customer // No access modifier. This means class has default access modifier
{  
	
	// Default access modifier
	String customerName = "Salman";
	
	// Default access modifier method
	void sayHello(String name) {
		System.out.println("Welcome to the "+name);
	}
}
