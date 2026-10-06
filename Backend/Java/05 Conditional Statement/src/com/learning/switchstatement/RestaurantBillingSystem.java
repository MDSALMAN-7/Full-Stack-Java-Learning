/*1. Restaurant Billing System
Create a restaurant billing program.
Menu:
1. Pizza      ₹250
2. Burger     ₹150
3. Pasta      ₹200
4. Sandwich   ₹120
5. Exit

Requirements:
- Use switch-case.
- Ask for item choice and quantity.
- Calculate the total.
- Use separate methods such as:
displayMenu()
calculateBill()

- Use a loop so the customer can order multiple items.
Challenge: Don't put all your code inside main().*/

package com.learning.switchstatement;
import java.util.Scanner;

public class RestaurantBillingSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		RestaurantBillingSystem rbs = new RestaurantBillingSystem();

		int total = 0;
		int choice;
		rbs.displayMenu();

		do {
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter quantity: ");
				int pizzaQty = sc.nextInt();

				total = total + calculateBill(250, pizzaQty);

				System.out.println("Pizza added.");
				break;

			case 2:
				System.out.print("Enter quantity: ");
				int burgerQty = sc.nextInt();

				total = total + calculateBill(150, burgerQty);

				System.out.println("Burger added.");
				break;

			case 3:
				System.out.print("Enter quantity: ");
				int pastaQty = sc.nextInt();

				total = total + calculateBill(200, pastaQty);

				System.out.println("Pasta added.");
				break;

			case 4:
				System.out.print("Enter quantity: ");
				int sandwichQty = sc.nextInt();

				total = total + calculateBill(120, sandwichQty);

				System.out.println("Sandwich added.");
				break;

			case 5:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice!");
			}

		} while (choice != 5);

		System.out.println("----------------------");
		System.out.println("Final Bill = ₹" + total);
		System.out.println("Thank you!");

		sc.close();
	}

	public  void displayMenu() {

		System.out.println("\n===== RESTAURANT MENU =====");
		System.out.println("1. Pizza      ₹250");
		System.out.println("2. Burger     ₹150");
		System.out.println("3. Pasta      ₹200");
		System.out.println("4. Sandwich   ₹120");
		System.out.println("5. Exit");
	}

	public static int calculateBill(int price, int quantity) {

		return price * quantity;
	}
}
