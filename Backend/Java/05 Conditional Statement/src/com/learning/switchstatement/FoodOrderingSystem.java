/*2. Food Ordering System
Create a food-ordering program.
1. Pizza     ₹250
2. Burger    ₹150
3. Pasta     ₹200
4. Sandwich  ₹120
5. Exit

Ask the user for:
- Choice
- Quantity
Calculate and display the total bill.
Example:
Enter choice: 2
Enter quantity: 3

Total = ₹450*/

package com.learning.switchstatement;

import java.util.Scanner;

public class FoodOrderingSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		FoodOrderingSystem food = new FoodOrderingSystem();
		food.displayMenu();

		System.out.print("Enter choice: ");
		int choice = sc.nextInt();

		System.out.print("Enter quantity: ");
		int quantity = sc.nextInt();

		food.orderFood(choice, quantity);

		sc.close();
	}

	public void orderFood(int choice, int quantity) {

		int price = 0;

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
		case 5:
			System.out.println("Thank you! Exiting...");
			return;
		default:
			System.out.println("Invalid choice.");
			return;
		}

		int total = price * quantity;

		System.out.println("Total = ₹" + total);
	}
	
	public void displayMenu() {

		System.out.println("\n===== RESTAURANT MENU =====");
		System.out.println("1. Pizza     ₹250");
		System.out.println("2. Burger    ₹150");
		System.out.println("3. Pasta     ₹200");
		System.out.println("4. Sandwich  ₹120");
		System.out.println("5. Exit");
	}
}
