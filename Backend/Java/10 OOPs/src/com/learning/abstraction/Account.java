// Abstraction means Hiding implementation

package com.learning.abstraction;

public class Account {
	
	// responsible for opening an bank account
	// this is caller
	public boolean openAccount(String name, String address, String pan) // abstract
	{
		connectWithDB();
		validateNameandAddress(name, address);
		validatePan(pan);
		createUserId();
		notifyUser();
		return true;
	}
	
	public boolean validateNameandAddress(String name, String address) {
		System.out.println("Account.validateNameandAddress().. Validating");
		return true;
	}
	 
	public boolean validatePan(String pan) {
		System.out.println("Account.validatePan().. valdating pan");
		return true;
	}
	
	public void connectWithDB() {
		System.out.println("Account.connnectWithDB()... DB Connection");
	}
	
	public String createUserId() {
		System.out.println("Account.createuserId()... creating user id...");
		return "some user id...";
	}
	
	public void notifyUser() {
		System.out.println("Account.notifyUser()... sending notificaton to user");
	}
}
