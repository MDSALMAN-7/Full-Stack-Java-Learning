package com.exception.basic;

public class ExeptionExample {
	public static void main(String[] args) {
		System.out.println("ExeptionExample.main() - started");
		int[] arr = { 1, 2, 3 };
		System.out.println(arr[5]); // Accessing invalid index
									// Exception occured at line number 7. code after this line will not execute
									// here get ArrayIndexOutOfBoundException 
		System.out.println("This line won't execute."); // This line will not execute.
		System.out.println("ExeptionExample.main() Ended.");

	}
}
