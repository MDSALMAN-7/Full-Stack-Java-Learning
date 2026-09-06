/*	
	5. Count Digits
	Take an integer from the user and count how many digits it has.
	Example:
	Input: 58392
	Output: 5 digits
*/

import java.util.Scanner;

public class CountDigits
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int number = sc.nextInt();
		
		int count = 0;
		while(number>0){
			number = number/10;
			count++;
		}
		System.out.println(count);
	}
}