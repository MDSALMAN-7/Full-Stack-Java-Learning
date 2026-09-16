class ZeptoAmazonUseCase
{
	public static void main(String[] args)
	{
		int orderValue = Integer.parseInt(args[0]);
		int maxValue = 500;
		
		 
		
		// use Case of Delivery
		String delivery = orderValue>maxValue ? "Delivery Free... " : "Delivery Carges Applicable";
		System.out.println(delivery);
		// use Case or primeuser or not
		boolean isPrimeUser = Boolean.parseBoolean(args[1]);
		String user = isPrimeUser ? "Same day Delivery":"it will take time";
		System.out.println(user);
		
	}
}