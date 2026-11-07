package com.salman.accessmodifier.default1;

class OrderDriver {
	public static void main(String[] args) {
		System.out.println("main Start()");
		OrderMgmt om = new OrderMgmt();
		om.placeOrder("Salman");
		System.out.println("main close");
	}
}
