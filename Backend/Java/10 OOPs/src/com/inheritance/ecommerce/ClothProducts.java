package com.inheritance.ecommerce;

public class ClothProducts extends Product {
	String gender;
	String brand;
	
	public ClothProducts(String productName, String description, int quantity, String status, String gender,
			String brand) {
		super(productName, description, quantity, status);
		this.gender = gender;
		this.brand = brand;
	}
	
	public void viewClothProductDetails() {
		System.out.println(productName);
		System.out.println(description);
		System.out.println(quantity);
		System.out.println(status);
		System.out.println(gender);
		System.out.println(brand);
	}
}
