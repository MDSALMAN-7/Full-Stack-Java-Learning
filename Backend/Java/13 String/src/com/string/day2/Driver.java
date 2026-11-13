package com.string.day2;

public class Driver {
	public static void main(String[] args) {
		String s = "Java";  // Object goes to SCP
		
		String s2 = new String("Learning");  // here techically two object created 
											 // first one in Scp
											 // Second is in Heap memory
		
		String s3 = new String("Java");
		String s4 = new String("Java");
		
		System.out.println(s3 == s4); //false because address is diff
		
		System.out.println(s3.equals(s4)); // True because content is same
		
	}
}
