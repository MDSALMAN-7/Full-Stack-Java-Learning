package com.salman.makemytrip;
import java.util.Scanner;

public class Driver{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you amount : ");
		int amount = sc.nextInt();
		MakeMyTripDis mmtd = new MakeMyTripDis();
		mmtd.getDiscount(amount);
		sc.close();
	}
}
