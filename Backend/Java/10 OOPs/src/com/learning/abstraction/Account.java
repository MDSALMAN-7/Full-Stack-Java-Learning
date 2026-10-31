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
	
	// if write core functionalities public other class can acess directly
	// we need to hide the core functionalities usign private Access modifier
	// then other class not able to access core functionalities
	// Core functionalities
	private boolean validateNameandAddress(String name, String address) {
		System.out.println("Account.validateNameandAddress().. Validating");
		return true;
	}
	
	// Core functionalities
	private boolean validatePan(String pan) {
		System.out.println("Account.validatePan().. valdating pan");
		return true;
	}
	
	// Core functionalities
	private void connectWithDB() {
		System.out.println("Account.connnectWithDB()... DB Connection");
	}
	
	// Core functionalities
	private String createUserId() {
		System.out.println("Account.createuserId()... creating user id...");
		return "some user id...";
	}
	
	// Core functionalities
	private void notifyUser() {
		System.out.println("Account.notifyUser()... sending notificaton to user");
	}
}
