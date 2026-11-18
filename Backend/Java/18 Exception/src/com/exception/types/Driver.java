package com.exception.types;

public class Driver {
	public static void main(String[] args) {
		String name = null;
		
//		System.out.println(name.length()); //NPE
		
		String className = "com.exception.types.Driver";
		
		try {
			Class.forName(className); // loading the class into memory
			System.out.println("class loaded ...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
