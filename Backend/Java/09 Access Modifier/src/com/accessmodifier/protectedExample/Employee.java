package com.accessmodifier.protectedExample;

//public class Employee {
//	protected int salary = 30000;
//	
//	protected void display() {
//		System.out.println("Salary : "+salary);
//	}
//}

public class Employee{
	// protected variable
	protected String employeeName;
	
	
	// Constructor to initialize employeeName
	public Employee(String name) {
		this.employeeName = name;
	}
	
	// Protected method
	 protected void sayHello() {
		 System.out.println("Hello, "+employeeName +"!");
	 }
}
