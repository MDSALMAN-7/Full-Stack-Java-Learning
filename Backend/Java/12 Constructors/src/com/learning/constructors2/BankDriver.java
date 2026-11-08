package com.learning.constructors2;

public class BankDriver {
	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount("Salman", "56765467656", 76556);
		BankAccount ba2 = new BankAccount();
		
		System.out.println("Account holder name : "+ba1.accountHolder);
		System.out.println("Account Number : "+ba1.accountNumber);
		System.out.println("Balance : "+ba1.balacne);
		System.out.println("Account holder name : "+ba2.accountHolder);
		System.out.println("Account Number : "+ba2.accountNumber);
		System.out.println("Balance : " +ba2.balacne);
	}
}
