/*
	1. Positive, Negative, or Zero
	Take an integer from the user and check whether it is:
	Positive
	Negative
	Zero
*/

import java.util.Scanner;
public class CheckNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int number = sc.nextInt();
		
		if(number < 0){
			System.out.print(number+" is Negative");
		}
		else if(number > 0){
			System.out.print(number+" is Positive");
		}
		else if(number == 0){
			System.out.print(number+" is Zero");
		}
		else{
			System.out.print(number+" is Invalid");
		}
		
	}
}