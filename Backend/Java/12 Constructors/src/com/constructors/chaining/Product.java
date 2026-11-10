package com.constructors.chaining;

class ProductDetails {
	String productId;
	String productName;
	int price;
	String category;
	
	public ProductDetails(String productId, String productName, int price, String category) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.category = category;
	}
	
	public ProductDetails(String productId,String productName) {
		this(productId,productName,0,"Food");
	}
	
	public ProductDetails() {
		System.out.println("Default Constructor ");
	}	
}

public class Product{
	public static void main(String[] args) {
		ProductDetails product = new ProductDetails("Elec45L67","Laptop");
		System.out.println("Product Id "+product.productId);
	}
}
