package com.learning.opps.polymorphism2;

class Employee{
	public void markIn() {
		System.out.println("Employee.markIn()... Marking IN");
	}
}

class HRManager extends Employee{
	@Override
	public void markIn() {
		System.out.println("HRManager.markIn()... Marking IN");
	}
}

public class Driver {
	public static void main(String[] args) {
//		Employee e = new Employee();
//		e.markIn();
		
		Employee e2 = new HRManager(); // Parent class can refer child class object
		
		e2.markIn(); // same method will behave differently based on the actual object
		// 1. at the time of compilation, it will check the method exits in the class employee
		// 2. at the time of execution(while running), it will call the method on actual object
		e2.hashCode();
	}
}
