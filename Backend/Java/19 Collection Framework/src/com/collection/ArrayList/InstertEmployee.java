package com.collection.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InstertEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> empName = new ArrayList<>();
		
		for(int i=1; i<=5; i++) {
			System.out.println("Enter Employee Name "+i+":");
			String name = sc.nextLine();
			
			empName.add(name);
		}
		
		System.out.println("Before Adding Total employees : "+empName.size());
		empName.add(2, "Rohan");
		
		System.out.println("After Adding Total Employees : "+empName);
		
	}
}
