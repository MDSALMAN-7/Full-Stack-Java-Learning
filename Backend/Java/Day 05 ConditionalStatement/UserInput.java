// User Input

import java.util.Scanner;

public class UserInput
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); // Create a Scanner Object for Input
		
		// Using nextInt() to read an integer
		System.out.print("Enter your age : "); // Prompt user to enter their age.
		int age = sc.nextInt(); // Read an integer input
		
		sc.nextLine();
		System.out.print("Enter you full name : ");
		String fullName = sc.nextLine();
		
		System.out.println("Age : " +age);
		System.out.print("Full Name : "+fullName);
		
	}
}