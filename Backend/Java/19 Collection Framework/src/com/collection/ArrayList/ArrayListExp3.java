package com.collection.ArrayList;

import java.util.ArrayList;

public class ArrayListExp3 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		int totalElements = Integer.parseInt(args[0]);
		
		for(int i=0; i<totalElements; i++) {
			list.add("kd"+i);
//			System.out.println("sdfsd"+i);
		}
		
		System.out.println("Total Elements are : "+list);
	}
}
