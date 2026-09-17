class FundTransfer
{
	public static void main(String[] args)
	{
		boolean result = FundTransfer.doTransaction(10,"1234567890","0987654321"); //  ye 10,"1234567890","0987654321" argument h 
		System.out.println("Is txn successful..."+result);
	}
	
	static boolean doTransaction(int amountToBeTxn, String senderAccNo, String recAccNo){ // int amountToBeTxn, String senderAccNo, String recAccNo This are parameter
		System.out.println("Entered doTransaction()");
		
		System.out.println("Input Received "+amountToBeTxn+" "+senderAccNo+" "+recAccNo);
		// some bussiness logic which will perform the transaction.
		
		System.out.println("Exit doTransaction()");
		return false;
	}
	
}