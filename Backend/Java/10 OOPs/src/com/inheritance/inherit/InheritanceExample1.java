package com.inheritance.inherit;

class Employee{
	String name = "Salman";
	String address = "Banglore";
	
	private String empCode = "KW164";
	
	public void markIn(String empId) {
		System.out.println("Marking In"+empId);
	}
}

class Manager extends Employee{  // Manager IS-A Employee
	public void doSomething() {
		System.out.println(name); // using the parent class attribute
		System.out.println(address);
//		System.out.println(empCode); not able to access the reason is that empCode is private 
		markIn(address);
	}
}


public class InheritanceExample1 {
	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.doSomething();
	}
}
