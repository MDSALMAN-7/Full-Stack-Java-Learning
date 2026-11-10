package com.learning.constructors.Super;

public class ClothProduct extends Product {
	String  color;
	
	public ClothProduct(String name, int price, String productId, String color) {
		super(name,price,productId);
		this.color = color;
	}
	
	public void displayDetails() {
		System.out.println("Product Name : "+name);
		System.out.println("Price : "+price);
		System.out.println("Product Id : "+productId);
		System.out.println("Warranty : "+color);
	}
	
}
