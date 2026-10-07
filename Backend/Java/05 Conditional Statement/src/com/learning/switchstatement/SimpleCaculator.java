/*2. Simple Calculator
Create a calculator:
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Exit

Ask for two numbers.
Use separate methods:
add()
subtract()
multiply()
divide()

Use switch-case to call the correct method.
Example:
Enter choice: 1
Enter first number: 20
Enter second number: 10

Result = 30*/

package com.learning.switchstatement;

import java.util.Scanner;

public class SimpleCaculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleCaculator calculator = new SimpleCaculator();

		System.out.print("Enter Num1 : ");
		int num1 = sc.nextInt();

		System.out.print("Enter Num2 : ");
		int num2 = sc.nextInt();

		calculator.displayCalculator();
		calculator.calculatorOperaion(num1, num2, sc);

	}

	public void displayCalculator() {
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Exit");
	}

	public void calculatorOperaion(int num1, int num2, Scanner sc) {
		System.out.println("Enter you choice : ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Result = " + add(num1, num2));
			break;
		case 2:
			System.out.println("Result = " + subtract(num1, num2));
			break;
		case 3:
			System.out.println("Result = " + multiply(num1, num2));
			break;
		case 4:
			System.out.println("Result = " + divide(num1, num2));
			break;
		case 5:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}

	}
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int subtract(int num1, int num2) {
		return num1 - num2;
	}

	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	public int divide(int num1, int num2) {
		return num1 / num2;
	}
}
