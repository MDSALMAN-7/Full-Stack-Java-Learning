package com.learning.constructors.Super;

public class Driver {
	public static void main(String[] args) {
		ElectronicProduct ep = new ElectronicProduct("Dell Laptop", 27699, "D1232G34", 2);
		
		ClothProduct cp = new ClothProduct("Black Shirt",499,"CP423S123","Black");
//		ep.displayDetails();
		cp.displayDetails();
		
	}
}
