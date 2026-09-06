/*	
	8. Palindrome Number
	Take a number and check whether it is a palindrome.
	Example:
	Input: 121
	Output: Palindrome
*/

import java.util.Scanner;

public class PalindromeNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int number = sc.nextInt();
		
		int reverse = 0;
		
		while(number>0){
			int lastDigit = number%10;
			number = number/10;
			reverse = reverse*10+lastDigit;
		}
		if(number == reverse){
			System.out.print("Number is Palindrome");
		}
		else{
			System.out.print("Number is not Palindrome");
		}
	}
}