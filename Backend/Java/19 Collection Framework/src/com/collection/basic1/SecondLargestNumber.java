package com.collection.basic1;

import java.util.ArrayList;

public class SecondLargestNumber {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(70);
		numbers.add(50);
		numbers.add(34);
		numbers.add(23);
		
		int max = numbers.get(0);
		int max2 = numbers.get(1);
		
		if(numbers.get(0)>numbers.get(1)) {
			max = numbers.get(0);
			max2 = numbers.get(1);
		}else {
			max2 = numbers.get(0);
			max = numbers.get(1);	
		}
		
		for(int i = 2; i<numbers.size(); i++) {
			if(numbers.get(i)>max) {
				max2 = max;
				max = numbers.get(i);
			}else if (numbers.get(i) > max2) {

                max2 = numbers.get(i);
            }
		}
		System.out.println(max2);
	}
}
