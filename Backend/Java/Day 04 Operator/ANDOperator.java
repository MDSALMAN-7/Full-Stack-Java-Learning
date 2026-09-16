class ANDOperator
{
	public static void main(String[] args)
	{
		int minCount = 20;
		int maxCount = 50;
		
		int userCount = Integer.parseInt(args[0]);
		
		System.out.println("Condition 1 : "+(minCount<userCount));
		System.out.println("Condition 1 : "+(maxCount>userCount));
		
		System.out.println("Open Theater : " +((minCount<userCount)&&(maxCount>userCount)));
	}
}