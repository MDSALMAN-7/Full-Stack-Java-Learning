/*
	7. Find the First Divisor
	Take a number from the user and find its first divisor other than 1.
	Example:
	Input: 15
	Output:
	First divisor = 3
	Requirement: Once you find the divisor, use break to stop the loop.
*/

import java.util.Scanner;

public class FirstDivisor
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		for(int i = 2; i<=num; i++){
			if(num%i==0){
				System.out.print("First divisor = "+i);
				break;
			}
		}
	}
}