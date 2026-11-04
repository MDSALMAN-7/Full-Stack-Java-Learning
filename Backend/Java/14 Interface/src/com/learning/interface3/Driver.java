package com.learning.interface3;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IAccount account = (name, address, pin) -> {
			System.out.println("Opening Account"+name);
			return "Open Account";
		};
		String result = account.openAccount("Salman","BTM Banglore",81202);
	}

} 
