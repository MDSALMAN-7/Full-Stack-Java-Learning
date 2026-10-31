package com.learning.oops.polymorphism;


class Delivery extends Object
{
	public void doDelivery() {
		System.out.println("Delivery.doDelivery()....");
	}
}

class ExpressBee extends Delivery
{
	@Override
	public void doDelivery() {
		System.out.println("ExpressBee.doDelivery()....");
	}
}
class Ekart extends Delivery
{
	@Override
	public void doDelivery() {
		System.out.println("Ekart.doDelivery()....");
	}
}


public class Driver {

	public static void main(String[] args) {
		
		Delivery delivery = new Delivery();
		
		// downcasting ke liye upcasting jaruri h
		
		//Compile time --> it wil check the method in Delivery Class
		// Runtime --> it will call the method of delivery class
		delivery.doDelivery();
		
		// Parent class can refer child calss object
		Delivery delivery1 = (Delivery)new ExpressBee();
		// compile --> it will check the method in Delivery Class
		// runtime --> it will call the method of ExpressBee class 
		delivery1.doDelivery();
		
		Delivery del = new ExpressBee();
		
		ExpressBee
	}

}
