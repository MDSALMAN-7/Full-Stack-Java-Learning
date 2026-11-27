package com.abstraction.basic1;

public class Account {
	// responsible for opening account
	// RBI --> one pan can should not have more than 5 account
	
	public boolean openAccount(String name, String address, String pan) {
		connectwithDB();
		validateNameandAddress(name, address);
		validatePan(pan);
		createUserID();
		notifyUser();
		
		return true;
	}
	
	// Core functionalites
	private boolean validateNameandAddress(String name, String address) {
		System.out.println("Account.validateNameandAdress()...");
		return true;
	}
	
	// core functionalites
	private boolean validatePan(String pan) {
		System.out.println("Accout.validatePan()...");
		return true;
	}
	
	// core functionalites
	private boolean connectwithDB(){
		System.out.println("Account.connectwithDB()...");
		return true;
	}
	
	// core functionalities
	private boolean createUserID() {
		System.out.println("Account.createUserID()...");
		return true;
	}
	
	// core functionalities
	private boolean notifyUser() {
		System.out.println("Your account is succesful open");
		return true;
	}
}
