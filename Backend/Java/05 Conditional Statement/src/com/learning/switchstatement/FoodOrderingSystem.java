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

public class FoodOrderingSystem {
	public static void main(String[] args) {
		FoodOrderingSystem fos = new FoodOrderingSystem();
		fos.displayMenu();
	}
	
	public void displayMenu() {

		System.out.println("\n===== RESTAURANT MENU =====");
		System.out.println("1. Pizza      ₹250");
		System.out.println("2. Burger     ₹150");
		System.out.println("3. Pasta      ₹200");
		System.out.println("4. Sandwich   ₹120");
		System.out.println("5. Exit");
	}
	
}
