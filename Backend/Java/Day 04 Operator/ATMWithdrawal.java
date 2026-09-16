/* 1.ATM Withdrawal
Take these inputs using command-line arguments:
Account balance
Withdrawal amount
Check whether the withdrawal is possible.
Rules:
Withdrawal amount must be less than or equal to balance.
If possible → print "Withdrawal Successful"
Otherwise → print "Insufficient Balance"
Also calculate and print the remaining balance. */

class ATMWithdrawal
{
	public static void main(String[] args)
	{
		int accounBalance = Integer.parseInt(args[0]);
		int withdrawalAmount = Integer.parseInt(args[1]);
		
		String message = accounBalance>=withdrawalAmount?"Withdrawal Successful":"Insufficient Balance";
		
		String result = accounBalance>=withdrawalAmount?"Remaining Balance : "+(accounBalance-withdrawalAmount):"";
		System.out.println(message);
		System.out.println(result);
		
	}
}