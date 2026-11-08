package com.learning.constructors2;

public class EcommerceDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EcommerceProduct product1= new EcommerceProduct("iphone",12345,"dfghj",5);
		EcommerceProduct product2= new EcommerceProduct("Motorola","dfghj");
		EcommerceProduct product3= new EcommerceProduct();
		
		System.out.println("--------First senario-------");
		System.out.println("Product Name : "+product1.productName);
		System.out.println("Product Price : "+product1.price);
		System.out.println("Product desc : "+product1.description);
		System.out.println("quantity : "+product1.quantity);
		System.out.println();
		
		System.out.println("--------Second senario-------");
		System.out.println("Product Name : "+product2.productName);
		System.out.println("Product desc : "+product2.description);
		System.out.println();
		
		System.out.println("--------Third senario-------");
		System.out.println("Product Name : "+product3.productName);
		System.out.println("Product Price : "+product3.price);
		System.out.println("Product desc : "+product3.description);
		System.out.println("quantity : "+product3.quantity);
		System.out.println();
		
		
		

	}

}
