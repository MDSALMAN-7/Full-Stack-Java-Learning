class SwapNumber
{
	public static void main(String arg[])
	{
		int a = 10;
		int b = 20;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("A : "+a);
		System.out.println("B : "+b);
	}
}