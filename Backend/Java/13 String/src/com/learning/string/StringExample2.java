package com.learning.string;

public class StringExample2 {
	public static void main(String[] args) {
		// using new keyword to create String objects on the heap
		
		String s1 = new String("Java"); // Create one object in the heap
		
		String s2 = new String("Java"); // Create another objects in the heap
		
		// comparing objects using ==(Check memory reference)
		System.out.println("s1==s2 : "+(s1==s2)); //false, because each new String creates a distinct object on the heap
		
		// Checking content equality using .equals
		System.out.println("s1.equals(s2): "+s1.equals(s2)); // true, because .equals compares content, not reference
	}
}
