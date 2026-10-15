package com.learning.encapsulation3;

public class BankAccountDriver {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount("Salman",34567767);
		
		ba.setName("Khan");
		ba.setBalance(98456789);
		
		System.out.println(ba.getName());
		System.out.println(ba.getBalance());
	}
}
