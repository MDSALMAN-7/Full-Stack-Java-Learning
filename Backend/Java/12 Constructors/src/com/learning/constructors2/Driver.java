package com.learning.constructors2;

public class Driver {

	public static void main(String[] args) {
		
		// type refName = new Class();
		
		Account acc = new Account();
		Account acc1 = new Account(17999,"Kamdev");
		 
		System.out.println(acc.name + " and "+acc.amount);
		System.out.println(acc1.name + " and "+acc1.amount);
		

	}

}
