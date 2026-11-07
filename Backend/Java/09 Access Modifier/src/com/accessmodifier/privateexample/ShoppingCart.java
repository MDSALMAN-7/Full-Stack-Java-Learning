package com.accessmodifier.privateexample;

public class ShoppingCart {
	private int totalAmt = 2500;
	
	private void applyDiscount() {
		int dis = totalAmt/10;
		int finalAmt = totalAmt-dis;
		
		System.out.println("After Discount : "+finalAmt);
	}
	
	public void checkOut() {   // this method is using for access the private method now private method will access to another class
		applyDiscount();  
	}
} 
