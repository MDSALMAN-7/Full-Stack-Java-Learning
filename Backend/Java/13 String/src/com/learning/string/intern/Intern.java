package com.learning.string.intern;

public class Intern {
	public static void main(String[] args) {
		String fname = "Md";
		
		String lname = new String("Md");
		
		System.out.println(fname == lname); //False
		
		String s = lname.intern();
		System.out.println(fname == s); // True
		
	}
}
