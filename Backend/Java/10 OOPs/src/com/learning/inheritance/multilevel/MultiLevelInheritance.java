package com.learning.inheritance.multilevel;

class Account
{
	public void whichOne() 
	{
		System.out.println("Java");
	}
}

class SavingAccount extends Account
{
	public void what() 
	{
		System.out.println("Learning");
	}
}

class PremiumSavingAccount extends SavingAccount
{
	public void where() {
		System.out.println("Banglore");
	}
}

public class MultiLevelInheritance {
	public static void main(String[] args) {
		
		PremiumSavingAccount premiumSavingAccount = new PremiumSavingAccount();
		
		premiumSavingAccount.whichOne();
		premiumSavingAccount.what();
		premiumSavingAccount.where();
	}
}
