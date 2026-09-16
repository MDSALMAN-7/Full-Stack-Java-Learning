class Operator
{
	public static void main(String[] args)
	{
		int minAge = 18; // here using Assignment operator to store value in variable
		
		int userAge = Integer.parseInt(args[1]); // converting String to array
		String name = args[0];
		
		System.out.println("Applying DL for : "+name);
		System.out.println("Allowed to apply for DL : "+(minAge<userAge));
	}
}