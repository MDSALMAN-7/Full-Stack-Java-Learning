package com.learning.constructors3;

class Invoice extends Object {
	int amount;
	String itemName;
	String billingAddress;
	String customerId;
	String customerName;
	
	Invoice(int _amount, String _itemName, String _billingAddress, String _customerId, String _customerName){
		this.amount = _amount;
		this.itemName = _itemName;
		this.billingAddress = _billingAddress;
		this.customerId = _customerId;
		this.customerName = _customerName;		
	}
}

public class Driver{
	public static void main(String[] args) {
		Invoice inv = new Invoice(189999,"Mackbook","BTM Banglore","df345d","Rana");
		System.out.print(inv.customerName);
	}
}
