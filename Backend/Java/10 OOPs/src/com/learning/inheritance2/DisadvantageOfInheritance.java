package com.learning.inheritance2; 

class Account {
	public void openAccount(String userId, String email) {
		System.out.println("Account.openAccount()");
	}
}

class SavingAccount extends Account
{
	@Override // Changing the super class method's functionalities.
	public void openAccount(String userId, String email) {
		System.out.println("SavingAccount.openAccount()");
	}
}
class SrCitAccount extends SavingAccount
{
	@Override // Changing the super class method's functionalities.
	public void openAccount(String userId, String email) {
		System.out.println("SrCitAccount.openAccount()");
	}
}
class PensionAccount extends SrCitAccount
{
	@Override // Changing the super class method's functionalities.
	public void openAccount(String userId, String email) {
		System.out.println("PensionAccount.openAccount()");
	}
}
