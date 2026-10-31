package com.learning.opps.overriding1;

public class Account {
	public String openAccount(String name, int initBal) {
		System.out.println("Account.openAccount...");
		return "some thing";
	}
}

class SavingAccount extends Account{
	
	// Rules or overriding
	// 1. Method name Should be same
	// 2. type, order and number of arguments should be same
	// 3. Return type should be same except covariant
	// 4. Access Modifier --> should be same or widen (public --> public,
	// 													protected  --> protected or public)
	
	@Override  // you are telling compiler that, i am overriding the method. Please check all the rules 
	public String openAccount(String savName, int initBal) {
		System.out.println("SavingAccount.openAccount()....");
		return "some other String";
	}
}
