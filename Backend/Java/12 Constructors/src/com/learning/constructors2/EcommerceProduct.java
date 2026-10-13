package com.learning.constructors2;

public class EcommerceProduct {
	
	String productname;
	int price;
	String desc;
	int qunt;
	
	
	EcommerceProduct(String _productname, int _price, String _desc, int _qunt){
		this.productname = _productname;
		this.price = _price;
		this.desc = _desc;
		this.qunt = _qunt;
				
	}
	EcommerceProduct(String _productname, String _desc){
		this.productname = _productname;
		this.desc = _desc;
	}
	public EcommerceProduct() {
		// TODO Auto-generated constructor stub
	}
}
