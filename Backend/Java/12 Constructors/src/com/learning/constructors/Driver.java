package com.learning.constructors;

public class Driver {
	public static void main(String[] args) {
//		AccountHolder acc = new AccountHolder(2000, "4567845678", "Kamdev","9876543211");
		// new keyword heap memory m store hota h 
		
		AccountHolder user1 = new AccountHolder(7000, "9876543345", "Salman", "9876543211");
		AccountHolder user2 = new AccountHolder(4000, "456787654323", "Kamdev", "6789876543");
		
		System.out.println("Account Holder name: "+user1.name);
		
	}
}
