package com.learning.abstraction;

//public class Discount {
//	int amount;
//	public void dis(int amount) {
//		int dis = amount*5/100;
//		int finalAmount = amount-dis;
//		System.out.println("Final : "+finalAmount);
//	}
//}

public class Discount{
	int amount;
	
	Discount(int _amount) {
		this.amount = _amount;	
	}
	public void dis() {
		int dis = amount*5/100;
		int finalAmount = amount-dis;
		System.out.println("Final : "+finalAmount);
	}
}
