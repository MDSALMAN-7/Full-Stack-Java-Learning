class MemberShipAmazon
{
	public static void main(String[] args)
	{
		int value = Integer.parseInt(args[0]);
		boolean isMember = Boolean.parseBoolean(args[1]);
		
		String member = isMember ? "Free Delivery \nSame Day Delivery":"Charge applicable\n it will take time";
		System.out.println(member);
	}
}