package com.learning.constructors2;

public class LaptopDriver {
	public static void main(String[] args) {
		Laptop laptop1 = new Laptop("Dell", "4 GB", "256 SSD GB", 23499);
		Laptop laptop2 = new Laptop("HP Victus", "8 GB", "512 SSD GB", 42499);
		Laptop laptop3 = new Laptop("MacBook", "8 GB", "512 SSD GB", 67499);
		
		System.out.println("Brand : "+laptop1.brand);
		System.out.println("Ram : "+laptop1.ram);
		System.out.println("Storage : "+laptop1.storage);
		System.out.println("Price : "+laptop1.price);
		
	}
}
