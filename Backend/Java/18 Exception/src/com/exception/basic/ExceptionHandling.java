package com.exception.basic;

public class ExceptionHandling {
	public static void main(String[] args) {

		System.out.println(" Main() Start");
		ExceptionHandling driver1 = new ExceptionHandling();

		driver1.doSomething();

		System.out.println(" Main() End");

	}

	public void doSomething() {
		System.out.println("Driver.doSomething() Start");

		String name = null;
		int amount = 100;
	
		try {
			// Risky code --> code which may throw an exception.
			amount = amount/0;
			System.out.println(name.length()); // NPE -> Not handled
			System.out.println("After length().."); // Ingnored
		} 
		catch (NullPointerException e) { // This can catch Exception's Object and its child objects
			System.out.println("Name is Null...");
			e.printStackTrace();
		}
		catch (ArithmeticException e) {
			System.out.println("Number cant't be diveded by Zero");
			e.printStackTrace();
		}

		System.out.println("Driver.doSomething() end");

	}
}
