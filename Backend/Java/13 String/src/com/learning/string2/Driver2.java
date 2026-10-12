package com.learning.string2;

public class Driver2 {
	public static void main(String[] args) {
		String s = "Kodewala"; // SCP
		// in case i wnat to cahnge

		//you cannot modify string object 
		
//		String s2 = s.concat(" Academy"); // trying to change the object
										 // Object created in heap with content Kodewala Academy
		
		s.concat("Java");
		System.out.println(s); // 
		
		System.out.println(System.identityHashCode(s));
//		System.out.println(System.identityHashCode(s2));
		
	}
}