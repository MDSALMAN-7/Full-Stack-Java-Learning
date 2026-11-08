package com.learning.constructors;

public class Employee {
	// Data
	int empId;
	String empName;
	double salary;
	String department;
	
	Employee(int _empId, String _empName, double _salary, String _department){
		this.empId = _empId;
		this.empName = _empName;
		this.salary = _salary;
		this.department = _department;
	}
	
}
