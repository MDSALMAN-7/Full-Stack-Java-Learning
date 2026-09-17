class AddTwoNumber
{
	public static void main(String[] args)
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		sum(num1,num2);
		// System.out.println("Sum = "+result);
		
		
		
	}
	
	static int sum(int num1, int num2){ // int num1, int num2 --> this is local variable so I am not getting error
		int add = num1+num2;
		System.out.println("Sum = "+add);
		return add;
	}
}