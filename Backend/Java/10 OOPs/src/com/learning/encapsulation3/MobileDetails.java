package com.learning.encapsulation3;

public class MobileDetails {
	private String brand;
	private double price;
	
	public MobileDetails(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public double getPrice() {
		return price;
	}
	
}
