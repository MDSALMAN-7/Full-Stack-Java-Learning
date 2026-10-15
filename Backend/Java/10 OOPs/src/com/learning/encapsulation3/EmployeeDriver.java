 package com.learning.encapsulation3;

public class EmployeeDriver {
	public static void main(String[] args) {
		EmployeeDetails ed = new EmployeeDetails("Salman", 1234, 0);
		
		ed.setSalary(17800);
		
		System.out.println("Salary : " +ed.getSalary());
	}
}
