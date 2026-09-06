/*
	1. Extract Digits
	Take:
	int number = 98765;
	Extract and print each digit separately:
	9
	8
	7
	6
	5
*/

public class ExtractDigits
{
	public static void main(String arg[])
	{
		int number = 98765;
		int a = number/10000;
		int b = number/1000%10;
		int c = number/100%10;
		int d = number/10%10;
		int e = number%10;
		
		System.out.println(a);
		System.out.println(x: "Who");
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}