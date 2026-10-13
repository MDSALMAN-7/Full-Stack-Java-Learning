package com.learning.string;

public class StringImmutability {
	public static void main(String[] args) {
		String s1 = "Java";		// Stored in Scp
		String s2 = s1.concat("Learning"); 	// Creates a new Object in the heap
		
		// Original String remains unchanged
		System.out.println("s1: "+s1); // Outputs: Java
		System.out.println("s2: "+s2); // Outputs : Java Learning
		
		// Memory references(Address)
		System.out.println("Are s1 and s2 the same? "+(s1==s2)); // output : false
	}
}
