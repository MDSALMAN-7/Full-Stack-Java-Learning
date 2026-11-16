package com.practice.sibandiib;

class product{
	static String platform;
	String productName;
	double price;
	String availability;
	
	static {
		platform = "Amazon";
		System.out.println("SIB Executed ");
	}
	
	public product(String productName, double price) {
		super();
		this.productName = productName;
		this.price = price;
	}
	
	// IIB
	{
		availability = "In Stock";
	}
	
	public void display() {
		System.out.println("Product :"+productName);
		System.out.println("Platform :"+platform);
		System.out.println("Price :"+price);
		System.out.println("Availability :"+availability);
	}
	
}

public class Ecommerce {
	public static void main(String[] args) {
		product p = new product("Laptop", 15999);
		p.display();
	}
}
