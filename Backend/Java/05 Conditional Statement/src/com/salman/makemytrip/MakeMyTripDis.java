package com.salman.makemytrip;

public class MakeMyTripDis {
	public void getDiscount(int amount) {
		if (amount > 0) {
			if (amount <= 5000) {
				System.err.println("No Discount");
				System.out.println("Total amount" + amount);
			} else if (amount > 5000 && amount <= 1000) {
				int dis = amount * 10 / 100;
				System.out.println("Total Discount : " + dis);
				System.out.println("Total amount : " + (amount - dis));
			} else {
				int dis = amount * 15 / 100;
				
				if(dis>1250) {
					int fixedDis=1250;
					System.out.println("Total Discount : " + fixedDis);
					System.out.println("Total amount : "+(amount-fixedDis));
				}
				else {
					System.out.println("Total Discount : " + dis);
					System.out.println("Total amount : " + (amount - dis));
				}
				
			}
		}
		else {
			System.err.println("Enter valid number");
		}
	}
	
}
