/*	
	12. Calculate Time
	Take:
	int totalMinutes = 754;
	Convert it into:
	Hours = ?
	Minutes = ?
	Expected:
	Hours = 12
	Minutes = 34
*/

public class CalculateTime
{
	public static void main(String arg[])
	{
		int totalMinutes = 754;
		
		int hours = totalMinutes/60;
		int min = totalMinutes%60;
		
		System.out.println("Hours : "+hours);
		System.out.println("Minutes : " + min);
	}
}