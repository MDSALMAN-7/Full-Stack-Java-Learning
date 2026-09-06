/*
	9. Check Leap Year
	Take a year from the user and check whether it is a leap year.
	Example:
	Input: 2024
	Output: Leap Year
	Remember the basic rule:
	A year is a leap year if it is divisible by 4, with century-year exceptions handled by divisibility by 400.
*/

import java.util.Scanner;

public class CheckLeapYear
{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year : ");
		int year = sc.nextInt();
		
		if(year%400 == 0){
			System.out.print(year+ " is leap year");
		}
		else if(year%100 == 0){
			System.out.print(year+ " is not leap year");
		}
		else if(year%4==0){
			System.out.print(year+" is Leap year");
		}
		else{
			System.out.print(year+" is not Leap year");
		}
	}
}