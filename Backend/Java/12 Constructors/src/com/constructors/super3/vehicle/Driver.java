package com.constructors.super3.vehicle;

public class Driver {
	public static void main(String[] args) {
		Bike bike = new Bike(365000,"Ducati","Top Virent",360);
		Bike bike2 = new Bike(1365000,"Aya Bhus","Top Virent",360);
		
		bike.doDisplay();
		bike2.doDisplay();
	}
}
