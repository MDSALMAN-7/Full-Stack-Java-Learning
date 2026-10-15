package com.learning.inheritance;

public class SavingAccount extends Account // is line m child class access kar rha h parent class ke data ko
{
	public void openSavingAccount(String name, String address, String type) 
	{
		  // reusing the existing functionalities
			openBankAccount(name,address, type);
	}
}
