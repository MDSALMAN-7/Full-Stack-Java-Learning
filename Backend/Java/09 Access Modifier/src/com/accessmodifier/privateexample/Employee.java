package com.accessmodifier.privateexample;

public class Employee {
	private int employeeId = 101;
	private String name = "Salman";
	private double salary = 35000;
	
	
	public void display() {
		System.out.println("Employee Name : "+employeeId);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
	}
}
