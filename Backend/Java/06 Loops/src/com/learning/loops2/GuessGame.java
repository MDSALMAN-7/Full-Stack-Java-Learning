package com.learning.loops2;

import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int luckyNumber = 14;
		int userEntered = 0;
		
		while(luckyNumber != userEntered) { // if this is true then only loop will be executed
			System.out.print("Enter number : ");
			userEntered = sc.nextInt();
			
			if(userEntered == luckyNumber) {
				System.out.println("You won ...");
			}else {
				System.out.println("try again !!!");
			}
		}
	}

}
