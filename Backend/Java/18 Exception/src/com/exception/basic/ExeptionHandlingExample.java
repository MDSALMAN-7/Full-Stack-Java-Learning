package com.exception.basic;

public class ExeptionHandlingExample {
	public static void main(String[] args) {
		int[] arr = { 5, 12, 33, 87 };

		try {
			// Exception thrown here
			System.out.println(arr[5]); // Accesing invalid index
		}
		// exception caught here and handled
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Invalid index! Array size is only " + arr.length);
		}
		// This line will get executed after the exception caught. This mean program
		// will not terminate(exception handle) and continue running
		System.out.println("Program continues after the exceiption.");
	}
}
