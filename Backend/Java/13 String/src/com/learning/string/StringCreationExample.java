package com.learning.string;

public class StringCreationExample {
	public static void main(String[] args) {
		// Using String Literal
		String s1 = "Java";		// Created one object in the String Constant Pool
		String s2 = "Java";		// Refers to the same object in the String Constant pool because object's content
								// is same(Java)
		
		// Using the new Keyword
		String s3 = new String("Java");		// Created a new object in the heap
		String s4 = new String("Java");		// Created a new object in the heap
		
		// comparing memory address
		System.out.println("s1 == s2: "+(s1 == s2)); // True
		System.out.println("s3 == s4: "+(s3 == s4)); // True
		System.out.println("s1 == s3: "+(s1 == s3)); // false
		
		// Comparing content, Meaningfully equal or not.
		System.out.println("s1.equals(s2): "+s1.equals(s2));
		System.out.println("s3.equals(s4): "+s3.equals(s4));
		System.out.println("s1.equals(s3): "+s1.equals(s2));
	}
}
