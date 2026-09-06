/*	
	14. Average With Decimal
	A student gets:
	Math = 87
	Java = 92
	English = 78
	Python = 85
	Calculate the average marks and make sure the result can contain decimals.
*/

public class AverageWithDecimal
{
	public static void main(String arg[])
	{
		int math = 87;
		int java = 92;
		int english = 78;
		int python = 85;
		
		int average = (math+java+english+python)/4;
		
		System.out.println(average);
	}
}