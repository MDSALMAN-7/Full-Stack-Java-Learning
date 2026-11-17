package com.exception.basic;

public class DivisionCalculator {
	public static void main(String[] args) {
		int a = 4;
		int b = 0;
		int result;
		
		
		try {
			result =a/b;
			
		} 
		catch (ArithmeticException e) {
			System.out.println("not divisible");
			e.printStackTrace();
		}
		System.out.println("Calculation Completed");
	}
}
