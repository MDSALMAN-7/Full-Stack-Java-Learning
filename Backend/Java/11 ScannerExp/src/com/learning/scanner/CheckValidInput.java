package com.learning.scanner;

import java.util.Scanner;
public class CheckValidInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = 0;
		System.out.print("Please Enter the Price : ");
		// Before reading the Integer, you are going to make sure that user supply an int
		if(sc.hasNextInt()) {
			price = sc.nextInt();
			System.out.println("Price : "+price);
		}
		else {
			System.out.println("Please enter Valid inupt...");
		}
		
		sc.close();
	}
}
