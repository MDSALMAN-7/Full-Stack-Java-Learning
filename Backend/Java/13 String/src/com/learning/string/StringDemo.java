package com.learning.string;

public class StringDemo {
	public static void main(String[] args) {
		String fname = "kodewala"; // object create in SCP(String constant pool)--> address -> xyz1234
		String lname = "kodewala"; // Object with content "Kodewala" already created
								   // and last Name will refer to existing object.
								   // lastName is also pointing to address xyz1234
//		lname = "kodewala Academy";
		
		// String city = new String ("Banglore");
		
		System.out.println(fname == lname); // == will compare the address of an object
		System.out.println(fname.equals(lname)); // it will check only content not address
		 
		
	}
}
