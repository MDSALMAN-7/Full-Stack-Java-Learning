package com.learning.constructors.This;

class EmployeeDetails{
	String id;
	String name;
	double salary;
	
	// Constructor
	public EmployeeDetails(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void displayEmpDetail() {
		System.out.println("Employee Id : "+id);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Salary : "+salary);
	}
}

public class Employee {
	public static void main(String[] args) {
		EmployeeDetails emp1 = new EmployeeDetails("K101","Salman",18356);
		EmployeeDetails emp2 = new EmployeeDetails("K102","Kamdev",28356);
		EmployeeDetails emp3 = new EmployeeDetails("K103","Kamran",19356);
		
		emp1.displayEmpDetail();
		emp2.displayEmpDetail();
		emp3.displayEmpDetail();
	}
}
