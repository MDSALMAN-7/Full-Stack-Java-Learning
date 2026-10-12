/*Student Marks System
Ask the user to enter marks of 5 subjects and store them in an array.
Menu:
1. Display Marks
2. Calculate Total
3. Calculate Percentage
4. Find Highest Mark
5. Find Lowest Mark
6. Check Result
7. Exit

Create methods:
displayMarks()
calculateTotal()
calculatePercentage()
findHighest()
findLowest()
checkResult()

Use switch-case to call these methods.
*/

package com.learning.switchstatement;

import java.util.Scanner;

public class StudentMarksSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int marks[] = new int[5];
		int choice;
//		displayMenu();
		

		// First, enter the marks
//		displayMarks(marks, sc);

		// Calculate total after entering marks
		int total = calculateTotal(marks);
		checkStudentresult(total, sc,marks, total);

		System.out.println("Total Marks = " + total);

		// Calculate percentage
		calculatePercentage(total);
		
		
		

		sc.close();

	}

	public static void displayMenu() {
		System.out.println("===== Student Marks System =====");
		System.out.println("1. Display Marks");
		System.out.println("2. Calculate Total");
		System.out.println("3. Calculate Percentage");
		System.out.println("4. Find Highest Mark");
		System.out.println("5. Find Lowest Mark");
		System.out.println("6. Check Result");
		System.out.println("7. Exit");
	}

	public static void displayMarks(int marks[], Scanner sc) {

		for (int i = 0; i < marks.length; i++) {
			System.out.print("Enter your marks: ");
			marks[i] = sc.nextInt();
		}
		System.out.print("5 Subject marks : ");
		for (int i = 0; i < marks.length; i++) {
			System.out.print(marks[i] + " ");
		}
		System.out.println();
	}

	public static int calculateTotal(int marks[]) {
		int total = 0;

		for (int i = 0; i < marks.length; i++) {
			total += marks[i];
		}

		return total;
	}

	public static void calculatePercentage(int total) {
		int percentage = total / 5;
		System.out.println("Percentae : " + percentage);
	}

//	55 66 44 77 88 
	public static void findHighest(int[] marks) {
		int lElement = marks[0];
		for (int i = 1; i < marks.length; i++) {
			if (lElement < marks[i]) {
				lElement = marks[i];
			}
		}
		System.out.println("Higest marks : " + lElement);
	}

	public static void findLowest(int[] marks) {
		int lowestMarks = marks[0];
		for (int i = 1; i < marks.length; i++) {
			if (lowestMarks > marks[i]) {
				lowestMarks = marks[i];
			}
		}
		System.out.println("Lowest marks : " + lowestMarks);
	}

	public static void checkResult(int total) {
		if (total > 180) {
			System.out.println("Pass...");
		} else {
			System.err.println("Fail...");
		}
	}

	// Menu for checking result
	public static void checkStudentresult(int choice, Scanner sc, int[] marks,int total) {
		do {
			displayMenu();
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				displayMarks(marks, sc);
				break;
			case 2:
				calculateTotal(marks);
				break;
			case 3:
				calculatePercentage(total);
				break;
			case 4:
				findHighest(marks);
				break;
			case 5:
				findLowest(marks);
				break;
			case 6:
				checkResult(total);
				break;
			case 7:
				System.out.println("Nothing to do....");
				break;
			}

		} while (choice != 7);
	}

}
