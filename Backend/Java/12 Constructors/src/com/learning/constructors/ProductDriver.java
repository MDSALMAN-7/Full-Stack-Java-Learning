package com.learning.constructors;

public class ProductDriver {
	public static void main(String[] args) {
		Product p1 = new Product(101, "Meggie", 15, "Fast Food", 3);
		Product p2 = new Product(101, "Meggie", 15, "Fast Food", 3);
		Product p3 = new Product(101, "Meggie", 15, "Fast Food", 3);
		
		System.out.println("Product Id : "+p1.productId);
		System.out.println("Product name: "+p1.productName);
		System.out.println("Price : "+p1.price);
		System.out.println("Category : "+p1.categroy);
		System.out.println("Quantity : "+p1.quantity);
	}
}
