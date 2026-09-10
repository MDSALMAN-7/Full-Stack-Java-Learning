class WhichNumberGreater
{
	public static void main(String args[])
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		if(num1>num2){
			System.out.print("Greater is : " +num1);
		}
		else{
			System.out.print("Greater is : " +num2);
		}
	}
}