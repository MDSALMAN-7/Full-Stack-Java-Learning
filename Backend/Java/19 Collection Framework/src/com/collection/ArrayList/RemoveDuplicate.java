//- Q11. Create an ArrayList of integers. Remove all duplicate numbers from it.
package com.collection.ArrayList;

import java.util.ArrayList;

public class RemoveDuplicate {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(20);
		numbers.add(50);
		numbers.add(40);
		numbers.add(30);
		
		System.out.println("Before Removing ");
		System.out.println(numbers);
		
		
		for(int i = 0; i<numbers.size(); i++) {
			int count = 0;
			int uniqueNumber = numbers.get(i);
			
			for(int j=0; j<numbers.size(); j++) {
				if(uniqueNumber == numbers.get(j)) {
					count++;
					if(count == 2) {
						numbers.remove(i);
					}
				}
			}
		}
		System.out.println(numbers);
		
		
	}
}
