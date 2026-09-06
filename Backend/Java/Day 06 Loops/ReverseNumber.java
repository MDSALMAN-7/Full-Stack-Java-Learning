/*
	6. Reverse a Number
	Take an integer and reverse it using a while loop.
	Example:
	Input: 12345
	Output: 54321
	Hint: You already practiced this using % and /. Now do it using a while loop.
*/

import java.util.Scanner;

public class ReverseNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int number = sc.nextInt();
		int reverse=0;
		
		while(number>0){
			int lastDigit = number%10;
			number = number/10;
			reverse = reverse*10+lastDigit;
		}
		System.out.print(reverse);
	}
}