package com.exception.basic;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Driver Main() Start ");
//		String name = null;
		
		String name = args[0];
		int marks = Integer.parseInt(args[1]);
		
		
		System.out.println(name);
		System.out.println(marks);
//		System.out.println(name.length());
		
		int amount = 100;
		int part = 0;
		int total = amount/part;
		
		System.out.println(total);
	}
}
