package com.collection.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		for(int i = 1; i<=10; i++) {
			System.out.println("Enter number "+i+" : ");
			int num = sc.nextInt();
			
			if(num%2==0) {
				numbers.add(num);
			}
		}
		
		System.out.println("Even Number :"+numbers);
		
		
	}
}
