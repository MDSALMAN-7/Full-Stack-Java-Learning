/*
	10. Find Middle Digit
	Take:
	int number = 583;
	Using / and %, find only the middle digit.
	Expected:
	8
*/

public class FindMiddleDigit
{
	public static void main(String arg[])
	{
		int number = 583;
		int middleNum = number/10%10;
		
		System.out.println("Middle number : "+middleNum);
	}
}
