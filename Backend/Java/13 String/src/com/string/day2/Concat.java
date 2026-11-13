package com.string.day2;

public class Concat {
	public static void main(String[] args) {
		String s = "Java";
		// in case I want to change s
		
		String s2 = s.concat("learning"); // trying to change the object
							  // Object is created in heap with content Kodewala Academy
		
		System.out.println(s2);
		
	}
}
