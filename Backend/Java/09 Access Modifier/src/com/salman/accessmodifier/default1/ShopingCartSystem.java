package com.salman.accessmodifier.default1;

class ShopingCartSystem {
	String productName;
	int price;
	int quantity;
	int total;
	
	
	void calculateTotal(int price, int quantity) {
		total = price * quantity;
//		System.out.println("Total Price : "+total);
	}
	
	void displayCart(String productname, int price, int quantity) {
		calculateTotal(price,quantity);
		System.out.println("Product Name : "+productname);
		System.out.println("Price : "+price);
		System.out.println("Qauntity : "+quantity);
		System.out.println("Total : "+total);
	}
	
	
}
