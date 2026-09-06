/*
	3. Product of Digits
	Take:
	int number = 234;
	Calculate:
	2 × 3 × 4
	Expected output:
	24
*/

public class ProductOfDigits
{
	public static void main(String arg[])
	{
		int number = 234;
		int a = number/100;
		int b = number/10%10;
		int c = number%10;
		
		int product = a*b*c;
		System.out.println("Product of Digits : " +product);
	}
}