package com.learning.inheritance.daimondproblem;

interface Account
{
	default void showBalance()
	{
		System.out.println("Account Balance");
	}
}

interface SavingAccount
{
	default void showBalance() 
	{
		System.out.println("Saving Account Balance");
	}
}

// Ambiguity arise when implementing both interface
class PremiumAccount implements Account, SavingAccount
{
	// Must override showBalance() to resolve ambiguity
	public void showBalance()
	{
		System.out.println("Premium Account Resolving Conflict");
	}
}


public class DaimondProblem {
	public static void main(String[] args) {
		PremiumAccount pa = new PremiumAccount();
		pa.showBalance(); // No Ambiguity because it's overridden
	}
}
