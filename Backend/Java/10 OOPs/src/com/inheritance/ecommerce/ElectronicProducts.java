package com.inheritance.ecommerce;

public class ElectronicProducts extends Product {
	boolean isWarranty;
	int warrantyInYears;

	public ElectronicProducts(String productName, String description, int quantity, String status, boolean isWarranty,
			int warrantyInYears) {
		super(productName, description, quantity, status);
		this.isWarranty = isWarranty;
		this.warrantyInYears = warrantyInYears;
	}
	
	public void veiwElectronicProductDetails() {
		System.out.println(productName);
		System.out.println(description);
		System.out.println(quantity);
		System.out.println(status);
		System.out.println(isWarranty);
		System.out.println(warrantyInYears);
	}
}
