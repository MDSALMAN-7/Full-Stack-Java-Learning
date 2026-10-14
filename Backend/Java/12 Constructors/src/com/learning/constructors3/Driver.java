package com.learning.constructors3;

class Invoice extends Object {
	
	static int gst=18; //  ye variable class  level ka h h
	
	// ye sara data instance variable h  or object level h
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
		Invoice inv2 = new Invoice(189999,"Mackbook","BTM Banglore","df345d","Salman");
		System.out.print(inv.customerName);
		
		System.out.println("First invoice : "+inv.amount +","+inv.customerId+","+inv.gst);
		System.out.println("2nd invoice : "+inv.amount +","+inv.customerId+","+inv2.gst);
	}
}
