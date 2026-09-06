/*
	7. Sum of Digits
	Take a number and calculate the sum of its digits.
	Example:
	Input: 583
	Output:
	5 + 8 + 3 = 16
*/

import java.util.Scanner;

public class SumOfDigits
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int number = sc.nextInt();
		int sum= 0;
		
		while(number>0){
			int lastDigit = number%10;
			number = number/10;
			sum+=lastDigit;
		}
		System.out.print(sum);
	}
}