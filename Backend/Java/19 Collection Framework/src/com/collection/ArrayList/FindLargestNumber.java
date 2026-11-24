//- Q10. Create an ArrayList of numbers and find the largest number without using any built-in sorting method.

package com.collection.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindLargestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<Integer>();

		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter Number " + i + " : ");
			int num = sc.nextInt();

			numbers.add(num);
		}

		System.out.println(numbers);

		int max = numbers.get(0);

		for (int i = 1; i < numbers.size(); i++) {

			if (numbers.get(i) > max) {
				max = numbers.get(i);
			}
		}

		System.out.println("Largest Number: " + max);

		sc.close();

	}
}
