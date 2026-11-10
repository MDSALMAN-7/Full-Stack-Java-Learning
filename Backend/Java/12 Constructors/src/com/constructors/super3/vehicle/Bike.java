package com.constructors.super3.vehicle;

public class Bike extends Vehicle{
	int price;
	String model;
	
	public Bike(int price, String model,String brand,double speed) {
		super(brand,speed);
		this.price = price;
		this.model = model;
	}
	
	public void doDisplay() {
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("Speed : "+speed);
		System.out.println("Price : "+price);
		System.out.println("----------------");
	}
	
}
