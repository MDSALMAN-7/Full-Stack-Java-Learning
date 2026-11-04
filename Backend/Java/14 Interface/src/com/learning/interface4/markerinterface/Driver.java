package com.learning.interface4.markerinterface;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		Account acc = new Account("Salman","BTM Banglore","987467969075");
		
		Account clonedObjacc = (Account) acc.clone();  // Trying to (copy/Xerox)
		
		System.out.println(clonedObjacc.accNo);
		
		if(acc instanceof Cloneable) {
			System.out.println("True");
		}
		else {
			System.err.println("False");
		}
	}

}
