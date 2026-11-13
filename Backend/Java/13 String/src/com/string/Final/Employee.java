package com.string.Final;

class EmpDetails{
	final int salary = 25000;
	
	void display() {
		System.out.println("Employee Salary : "+salary);
	}
	
	void tryDisplay() {
//		salary = 4567;
	}
	
}

public class Employee {
	public static void main(String[] args) {
		EmpDetails emp = new EmpDetails();
		emp.display();
	}
}
