package com.learning.encapsulation3;

public class EmployeeDetails {
	private String employeeName;
	private int empId;
	private double salary;
	
	public EmployeeDetails(String employeeName, int empId, double salary) {
		this.employeeName= employeeName;
		this.empId = empId;
		this.salary = salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
}
