package com.collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class UpdateElement {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		
		for(int i = 1; i<=10; i++) {
			numbers.add(i);
		}
		
		System.out.println("Before update : "+numbers);
		numbers.set(3, 5);
		System.out.println("After update : "+numbers);
		
		
	}
}
