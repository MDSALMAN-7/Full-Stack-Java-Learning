package com.learning.constructors.This;

class CarDetails{
	String brand;
	String model;
	public CarDetails(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	public void display() {
		System.out.println("Brand "+brand);
		System.out.println("Model "+model);
	}
}

public class Car {
	public static void main(String[] args) {
		CarDetails cd = new CarDetails("Tata","BS6");
		CarDetails cd1 = new CarDetails("Honda","BS6");
		
		cd.display();
	}
}
