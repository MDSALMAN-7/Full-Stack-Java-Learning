package com.learning.string;

public class StringExample {
	public static void main(String[] args) {
		// String Literals.
		String s1 = "Java"; // Store in SCP (String constant Pool).
		String s2 = "Java"; // Store in SCP (String constant Pool).
		String s3 = "Java"; // Store in SCP (String constant Pool).
		
		String s4 = new String("Java");
		
		// the == operator in java is used to compare reference of object
		System.out.println(s1 == s2); 
		System.out.println(s1 == s3);
		System.out.println(s1 == s4); // here get false because new is create new object in memory
		
		System.out.println(s1.equals(s4)); // here get true because .equals checks only content 
		
		
	}
}
