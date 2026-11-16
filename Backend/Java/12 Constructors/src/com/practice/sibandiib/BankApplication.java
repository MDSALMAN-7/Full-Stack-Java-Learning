package com.practice.sibandiib;

class BankAccount{
	static public String bankName;
	public String accountHolder;
	public String accountType;
	
	public BankAccount(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	// SIB
	static {
		bankName = "HDFC Bank";
//		System.out.println("Bank Name : "+bankName);
	}
	
	//IIB 
	{
		accountType = "Saving Account";
	}
	
	public void display() {
		System.out.println("Bank Name : "+bankName);
		System.out.println("Account Holder : "+accountHolder);
		System.out.println("Account type : "+accountType);
	}
	
}

public class BankApplication {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount("Salman");
		BankAccount ba2 = new BankAccount("Kamdev");
		
		ba.display();
		ba2.display();
	}
}
