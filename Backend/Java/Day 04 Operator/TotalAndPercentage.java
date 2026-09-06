class TotalAndPercentage
{
	public static void main(String arg[])
	{
		int math = 45;
		int hindi = 67;
		int english = 76;
		int java = 89;
		
		int total = math + hindi + english + java;
		float percentage = (total * 100)/400f;  
		System.out.println("Total marks -> "+total);
		System.out.println("Percentage -> "+percentage);
	}
}