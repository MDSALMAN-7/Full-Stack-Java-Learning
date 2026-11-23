package com.collection.ArrayList;

import java.util.ArrayList;

public class ArrayListExample2 {
	public static void main(String[] args) {
		ArrayList<String> products = new ArrayList<>();
		
		// Adding elements
		products.add("Lapton");
		products.add("Smartphone");
		products.add("Headphones");
		
		System.out.println("Electronic Products : "+ products); // Printing the list
		
		System.out.println("First Product : "+products.get(0)); // Accessing elements by index
		
//		products.remove("Smartphone"); // Removing an element
		products.remove(Integer.valueOf(1)); // Removing an element
		System.out.println("After removing SmartPhone: "+products);
		
		System.out.println("Total products: "+products.size()); // checking size
		
	}
}
