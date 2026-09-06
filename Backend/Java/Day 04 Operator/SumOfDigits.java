/*	
	2. Sum of Digits
	Take:
	int number = 583;
	Calculate the sum of its digits.
	Expected output:
	16
*/

public class SumOfDigits
{
	public static void main(String arg[])
	{
		int number = 583;
		int a = number/100;
		int b = number/10%10;
		int c = number%10;
		
		int sum = a+b+c;
		
		System.out.println("Sum of digits : "+sum);
		
	}
}