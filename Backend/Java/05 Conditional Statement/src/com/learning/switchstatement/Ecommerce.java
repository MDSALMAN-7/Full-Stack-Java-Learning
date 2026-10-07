package com.learning.switchstatement;

public class Ecommerce {

	public static void main(String[] args) {

		Ecommerce cs = new Ecommerce();
 
		String jtype = args[0];
		int amount = Integer.parseInt(args[1]);

		cs.api(jtype, amount);
	}

	public void api(String customer, int amount) {

		double dis = 0;
		double finalPrice = amount;

		switch (customer) {
		case "gold":
			if (amount > 1000) {
				dis = amount * 20 / 100;
				finalPrice = amount - dis;
			}
			System.out.println("Final Price : " + finalPrice);
			break;
		case "silver":
			if (amount > 1000) {
				dis = amount * 10 / 100;
				finalPrice = amount - dis;
			}
			System.out.println("Final Price : " + finalPrice);
			break;
		case "regular":
			if (amount > 1000) {
				dis = amount * 5 / 100;
				finalPrice = amount - dis;
			}
			System.out.println("Final Price : " + finalPrice);
			break;
		default:
			System.out.println("Invalid jewley.");
		}
	}
}
