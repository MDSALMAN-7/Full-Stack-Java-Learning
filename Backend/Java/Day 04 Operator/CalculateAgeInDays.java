/*
8. Calculate Age in Days
Assume:
1 year = 365 days
A person is:
25 years
6 months
10 days
Assume:
1 month = 30 days
Calculate their approximate age in total days.
*/

public class CalculateAgeInDays
{
	public static void main(String arg[])
	{
		int personYear=25;
		int personMonth = 6;
		int personDays = 10;
		
		int totalDays = (personYear*12*30)+(personMonth*30)+personDays;
		
		System.out.println(totalDays);
	}
}