package com.learning.encapsulation3;

public class MobileDriver {
	public static void main(String[] args) {
		MobileDetails md = new MobileDetails("Iphone", 234567);
		
		System.out.println(md.getPrice());
	}
}
