package com.sb.query;

public class Driver {
	public static void main(String[] args) {
		
		QueryGenerator generator = new QueryGenerator();
		
		StringBuilder result = generator.querygenerator(2000,null);
		
		System.out.println(result);
	}
}
