package com.collection.basic1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;

public class CollectionExample {
	public static void main(String[] args) {
		// Creating instances of the array, vector, and hashtable
		
		int arr[] = new int[] {1,2,3,4};
		
		Vector<Integer> v = new Vector<>();
		Hashtable<Integer, String> h = new Hashtable<>();
		
		// Adding elements into the vector
		v.add(6);
		v.add(2);
		
		// Adding elements into the hashtable
		h.put(1, "Java");
		h.put(2,"Learning");
		
		// Accessing the first element of the array, vector, and hashtable
		System.out.println(arr[0]); // Array Access
		System.out.println(v.get(0)); // vector access
		System.out.println(h.get(1));
		
	}
}
