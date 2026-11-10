package com.constructors.super3.employee;

public class Employee extends Person {
	String employeeId;
	double salary;
	
	public Employee(String employeeId, double salary, String name, int age) {
		super(name,age);
		this.employeeId = employeeId;
		this.salary = salary;
	}
	
	
}
