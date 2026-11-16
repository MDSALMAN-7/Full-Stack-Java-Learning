package com.practice.sibandiib;

import java.awt.geom.Ellipse2D;

class Employee1{
	public String name;
	public String country;
	public String status;

	public Employee1(String name) {
		super();
		this.name = name;
	}
	
	{
		country = "India";
		status = "active";
		
	}
	
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Country : "+country);
		System.out.println("Name : "+status);
	}
	
	
	
}
public class EmployeeRegistration {
	public static void main(String[] args) {
		Employee1 e = new Employee1("Salman");
		Employee1 e1 = new Employee1("Kamdev");
		
		e.display();
		e1.display();
	}
}
