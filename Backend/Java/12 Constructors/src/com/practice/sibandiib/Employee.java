package com.practice.sibandiib;

class EmployeeDetails {
	static String companyName;
	static String location;
	static {
		companyName = "Kodewala";
		location = "BTM Banglore";
		
	}
}

public class Employee{
	public static void main(String[] args) {
		System.out.println("Main Start : ");
		
//		EmployeeDetails empD = new EmployeeDetails();
		
		System.out.println("Company name : "+EmployeeDetails.companyName);
	}
}


