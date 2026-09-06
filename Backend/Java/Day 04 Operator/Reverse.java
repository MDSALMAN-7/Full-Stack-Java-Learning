/*
	1. Reverse a 3-Digit Number
	Take:
	int number = 123;
	Using / and %, produce:
	321
*/

public class Reverse
{
	public static void main(String arg[])
	{
		int number = 123;
		
		int lastDigit = number%10;
		number /= 10;
		
		int secondDigit = number%10;
		number /= 10;
		
		int firstDigit = number%10;
		
		int reverse = lastDigit*100 + secondDigit*10+firstDigit;
		
		System.out.println(reverse);
		
	}
}