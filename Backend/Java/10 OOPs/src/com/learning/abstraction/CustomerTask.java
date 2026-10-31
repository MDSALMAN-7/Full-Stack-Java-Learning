package com.learning.abstraction;

public class CustomerTask {
	public static void main(String[] args) {
		OrderService order = new OrderService();
		order.placeOrder();
	}
}
