/*
	15. Find the Middle Number
	Take three different numbers from the user and find the middle value.
	Example:
	Input:
	10
	50
	30
	Output:
	30 is the middle number.
	Don't simply sort the numbers. Use conditions.
*/

import java.util.Scanner;

public class FindMiddleNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int a = sc.nextInt();
		System.out.print("Enter second number : ");
		int b = sc.nextInt();
		System.out.print("Enter 3rd number : ");
		int c = sc.nextInt();
		
		if(a>b && a<c){
			System.out.print(a+" is middle number");
		}
		else if(b>a && b<c){
			System.out.print(b+" is middle number");
		}
		else {
			System.out.print(c+" is middle number");
		}
	}
}