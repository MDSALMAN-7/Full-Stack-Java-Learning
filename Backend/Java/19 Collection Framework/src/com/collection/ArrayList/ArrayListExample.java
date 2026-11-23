package com.collection.ArrayList;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		// create a container which will hold something(Objects)
		
		ArrayList<String> learners = new ArrayList<String>();
		
		//Storing the Data
		learners.add("Kamdev");
		learners.add("Sonu");
		learners.add("Somu");
		learners.add("salman");
		learners.add("kamran");
		learners.add("vijay");
		learners.add("Somu");
		learners.add(null);
//		learners.add("Sohai","Rashid");
		
		// read the data from container / arraylist
		System.out.println(learners);
	}
}
