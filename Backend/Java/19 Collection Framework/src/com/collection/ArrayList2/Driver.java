package com.collection.ArrayList2;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<String>();
		
		cities.add("Banglore");
		cities.add("Mumbai");
		cities.add("Dehli");
		cities.add("kolkata");
		cities.add("Hyderabad");
		cities.add("Munger");
		cities.add("patna");
		
		cities.remove(3);
		System.out.println(cities);
	}
}
