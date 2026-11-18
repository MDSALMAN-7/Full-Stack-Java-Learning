package com.exception.finally1;

public class Driver {
	public static void main(String[] args) {
		InvoiceService inv = new InvoiceService();
//		inv.connectDatabase();
		inv.generateInvoice();
	}
	
}
