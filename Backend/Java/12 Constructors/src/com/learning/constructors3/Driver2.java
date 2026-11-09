package com.learning.constructors3;

class Invoice1 extends Object{
	int amount;
	String itemName;
	String billingAddress;
	String customerId;
	String customerName;
	
	public Invoice1(int amount, String itemName, String billingAddress, String customerId, String customerName) {
		super();
		this.amount = amount;
		this.itemName = itemName;
		this.billingAddress = billingAddress;
		this.customerId = customerId;
		this.customerName = customerName;
	}
}

public class Driver2 {
	public static void main(String[] args) {
		Invoice1 inv = new Invoice1(179999, "Samsung Fold", "BTM Banglore", "UNF142", "Salman");
	}
}
