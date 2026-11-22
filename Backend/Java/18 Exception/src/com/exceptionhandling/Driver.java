package com.exceptionhandling;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Driver Start");

		Driver driver = new Driver();
		driver.doSomething();

		System.out.println("Driver End");
	}

	public void doSomething() {
		System.out.println("Driver.doSomething() Start");

		String name = null;

		try {
			// Risky code --> some time it may throw an exception
			int result = 1000/0;
			System.out.println(name.length()); // NPE not handled
		} catch (NullPointerException e) {
			System.out.println("Name is null");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("not divisible by Zero");
			e.printStackTrace();
		}

		System.out.println("Driver.doSomething() end");
	}
}
