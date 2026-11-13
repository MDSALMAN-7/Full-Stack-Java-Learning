package com.string.day3;

public class Driver {
	public static void main(String[] args) {
//		String s1 = "This" + "is" + "Java";   // compiler convert this only one object
		
		String s1 = "This" + "is" + "Java";
		System.out.println(s1);
		
		String s2 = "Java";
		String s3 = "Learning";
		
		String s4 = s2+s3; // Heap --> String builder
		System.out.println("S4"+s4);
		
		String s5 = "JavaLearning";
		
		System.out.println(s5 == s4.intern());
		
		
	}
}
