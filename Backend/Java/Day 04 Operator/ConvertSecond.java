class ConvertSecond
{
	public static void main(String arg[])
	{
		int totalSecond = 7384;
		int hour = totalSecond/(60*60);
		int min = (totalSecond%(60*60))/60;
		int second = (totalSecond%(60*60))%60;
		
		System.out.println("Hour : "+hour);
		System.out.println("Min : "+min);
		System.out.println("Second : "+second);
	}
}