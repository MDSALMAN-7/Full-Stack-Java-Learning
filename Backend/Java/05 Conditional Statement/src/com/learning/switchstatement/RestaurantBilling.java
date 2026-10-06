package com.learning.switchstatement;

import java.util.Scanner;

public class RestaurantBilling {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int choice;
		int quantity;
		int total = 0;
		displayMenu();
		while (true) {

			

			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			if (choice == 5) {
				System.out.println("Thank you for visiting!");
				break;
			}

			System.out.print("Enter quantity: ");
			quantity = sc.nextInt();

			int bill = calculateBill(choice, quantity);

			if (bill == -1) {
				System.out.println("Invalid choice!");
			} else {
				total = total + bill;
				System.out.println("Item added. Current total = ₹" + total);
			}
		}

		System.out.println("----------------------");
		System.out.println("Final Bill = ₹" + total);
		System.out.println("----------------------");

		sc.close();
	}

	public static void displayMenu() {

		System.out.println("\n===== RESTAURANT MENU =====");
		System.out.println("1. Pizza     ₹250");
		System.out.println("2. Burger    ₹150");
		System.out.println("3. Pasta     ₹200");
		System.out.println("4. Sandwich  ₹120");
		System.out.println("5. Exit");
	}

	public static int calculateBill(int choice, int quantity) {

		int price;

		switch (choice) {

		case 1:
			price = 250;
			break;

		case 2:
			price = 150;
			break;

		case 3:
			price = 200;
			break;

		case 4:
			price = 120;
			break;

		default:
			return -1;
		}

		return price * quantity;
	}
}
