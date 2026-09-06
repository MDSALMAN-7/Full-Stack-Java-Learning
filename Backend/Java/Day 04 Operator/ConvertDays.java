class ConvertDays
{
	public static void main(String arg[])
	{
		int totalDays = 400;
		int years = totalDays/365;
		int month = (totalDays%365)/30;
		int days = (totalDays%365)%30;
		
		System.out.println("Years : "+years);
		System.out.println("month : "+month);
		System.out.println("Days : " +days);
	}
}	