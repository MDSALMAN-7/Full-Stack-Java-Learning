package com.learning.constructors;

public class Product {
	int productId;
	String productName;
	double price;
	String categroy;
	int quantity;
	
	Product(int _productId, String _productName, double _price, String _category, int _quantity){
		this.productId = _productId;
		this.productName = _productName;
		this.price = _price;
		this.categroy = _category;
		this.quantity = _quantity;
		
	}
}
