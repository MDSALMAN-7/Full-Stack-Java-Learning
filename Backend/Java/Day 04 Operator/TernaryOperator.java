class TernaryOperator
{
	public static void main(String[] args)
	{
		int minAge = 18;
		int maxAge = 60;
		
		int userAge = Integer.parseInt(args[1]);
		String name = args[0];
		
		System.out.println("Applying DL for : "+name);
		
		// System.out.println("Condition 1 : "+(minAge<userAge));
		// System.out.println("Condition 1 : "+(max>userCount));
		
		String message = minAge<userAge?"Allowed":"NOt Allowed";
		System.out.println(message);
	}
}