package com.salman.accessmodifier;

// Classes in the same package can be used without an import.
class User
{
	public static void main(String[] args)
	{
		System.out.println("Run successful: ");
		
		// Use the Account class from the same package.
		Account acc = new Account();
		acc.showAccountInfo();
	}
}