package com.learning.constructors.Super;

public class ElectronicProduct extends Product {
	int warranty;

	public ElectronicProduct(String name, int price, String productId, int warranty) {
		super(name, price, productId); // init the default
		this.warranty = warranty;
	}
	
	public void displayDetails() {
		System.out.println("Product Name : "+name);
		System.out.println("Price : "+price);
		System.out.println("Product Id : "+productId);
		System.out.println("Warranty : "+warranty);
	}
}

// we use to super just to avoid the code duplicasy and no need to initialize every where just call the super
// super will call always super class 
