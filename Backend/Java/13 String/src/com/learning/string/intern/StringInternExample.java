package com.learning.string.intern;

public class StringInternExample {
	public static void main(String[] args) {
		String s1 = "Java Learning"; // String literal, automatically stored in the scp
		
		String s2 = new String("Java Learning"); // Creates a new String object on the heap
		
		// This will output 'false' because s2 points to the new object on the heap, not the scp
		System.out.println(s1 == s2); // false
		
		//Interning s2: this checks the scp and returns the refernce to the string in the pool
		String s3 = s2.intern();
		
		// Now, s3 refers to the same reference in the scp as s1
		System.out.println(s1 == s3); // true
		
	}
}
