package com.learning.inheritance2;

public class Driver {
	public static void main(String[] args) {
//		Account acc = new Account();
//		acc.openAccount("salman","skalsjd");
		
		// SingleInheritance file
//		School sc = new School();
//		sc.takeAdmission("Salman", 5);
		
		
		// Multiple Inheritance file
		College c = new College();
		c.takeAdmission("Salman", 12);
		
		SrrStudent ss = new SrrStudent();
		ss.takeAdmission("Salman",7);
	}
}
