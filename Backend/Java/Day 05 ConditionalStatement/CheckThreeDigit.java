/*
	16. Three-Digit Number Checker
	Take an integer from the user.
	Check whether it is a three-digit number.
	Examples:
	Input: 456
	Output: Three-digit number
	Input: 45
	Output: Not a three-digit number
*/

import java.util.Scanner;

public class CheckThreeDigit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int number = sc.nextInt();
		
		if(number>=100 && number<1000){
			System.out.print(" Three-digit number");
		}
		else{
			System.out.print("Not a three-digit number");
		}
	}
}