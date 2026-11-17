package com.exception.basic;

public class ArrayAccess {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4};
		
		try {
			System.err.println(numbers[2]);
		} catch (Exception e) {
			System.err.println("array index out exception");
			e.printStackTrace();
		}
		System.out.println("Array operation Completed ");
	}
}
