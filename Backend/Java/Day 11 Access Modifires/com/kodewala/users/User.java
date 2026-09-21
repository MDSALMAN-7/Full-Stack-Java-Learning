package com.kodewala.users;

// if class is in different package, we need to import it before using
import com.kodewala.account.Account;
class User
{
	public static void main(String[] args)
	{
		System.out.println("Run successful: ");
		
		// using account class which is in different class
		Account acc = new Account();
		acc.showAccountInfo();
	}
}