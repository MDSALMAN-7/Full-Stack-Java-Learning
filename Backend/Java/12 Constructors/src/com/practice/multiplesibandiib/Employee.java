package com.practice.multiplesibandiib;

class EmpDetails{
	static String companyName;
	static String companyLocation;
	public String employeeName;
	public String department;
	public String employeeStatus;
	
	static {
		companyName = "Google";
		System.out.println("1. SIB");
	}
	
	static {
		companyLocation = "Banglore";
		System.out.println("2. SIB");
	}
	
	// IIB
	{
		System.out.println("1. SIB");
	}
	{
		System.out.println("1. SIB");
	}
}

public class Employee {
	public static void main(String[] args) {
		
	}
}
