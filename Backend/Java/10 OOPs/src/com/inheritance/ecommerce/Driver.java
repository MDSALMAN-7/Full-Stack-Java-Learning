package com.inheritance.ecommerce;

public class Driver {
	public static void main(String[] args) {
		Product product = new Product("Moto", "India's most loving mobile", 23999, "In Stock");
		
//		product.viewProductDetails();
		
		ClothProducts cp = new ClothProducts("Jeans", "100% cotton jeans ", 1299, "In Stock", "Male", "Levis");
		cp.viewClothProductDetails();
	}
}
