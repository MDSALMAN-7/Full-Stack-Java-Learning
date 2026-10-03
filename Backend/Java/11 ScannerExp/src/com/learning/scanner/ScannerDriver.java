package com.learning.scanner;

import java.util.Scanner;

public class ScannerDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your roll number : ");
		int rollnum = sc.nextInt();
		sc.nextLine(); // Consume the extra char 
		System.out.print("Enter your name : ");
		String name = sc.nextLine();
		sc.close();
		
		System.out.println("Name : "+name);
		System.out.println("Roll Number : "+rollnum);
	}
}
