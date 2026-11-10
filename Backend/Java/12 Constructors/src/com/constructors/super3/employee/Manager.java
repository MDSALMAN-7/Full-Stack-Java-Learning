package com.constructors.super3.employee;

public class Manager extends Employee {
	String department;
	double bonus;
	
	public Manager(String department, double bonus,String name, int age, String employeeId, double salary) {
		super(employeeId,salary,name,age);
		this.department = department;
		this.bonus = bonus;
	}
	
}
