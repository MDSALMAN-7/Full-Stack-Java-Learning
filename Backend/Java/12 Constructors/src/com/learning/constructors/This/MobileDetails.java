package com.learning.constructors.This;

class Mobile{
	 String brand;
	 String type;
	 int price;
	 
	 public Mobile(String brand, String type, int price) {
		this.brand = brand;
		this.type = type;
		this.price = price;
	 }
	 
	 public Mobile(String brand, int price) {
		this(brand,"Normal Mobile",price);
	 }
	 
	 Mobile(){
		 this("Iphone", 179999);
	 }
	 
	 public void displayDetails() {
		 System.out.println("Mobile brand : "+brand);
		 System.out.println("Mobile Type : "+type);
		 System.out.println("Mobile price : "+price);
		 System.out.println("-------------------");
	 }
	 
}

public class MobileDetails {
	public static void main(String[] args) {
		Mobile m = new Mobile("Asus","Gaming Mobile",37999);
		Mobile m2 = new Mobile("Asus",37999);
		Mobile m3 = new Mobile();
		
//		System.out.println("Details "+m3.brand);
		
		m.displayDetails();
		m2.displayDetails();
		m3.displayDetails();
		
	}
}
