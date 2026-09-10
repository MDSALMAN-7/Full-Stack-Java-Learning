class AddNumCom
{
	public static void main(String[] arg)
	{
		// here i am using Integer.parseInt() method. this is converting string to integer
		int num1 = Integer.parseInt(arg[0]); // converting array to Integer using Integer.parseInt
		int num2 = Integer.parseInt(arg[1]);
		
		System.out.print(num1 + num2);
		
	}
}