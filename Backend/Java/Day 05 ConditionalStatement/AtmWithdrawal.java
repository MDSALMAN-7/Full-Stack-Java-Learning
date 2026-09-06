/*
	19. ATM Withdrawal
	Create a simple ATM program.
	Take:
	Current balance
	Withdrawal amount
	Rules:
	Withdrawal amount must be greater than 0.
	Withdrawal amount must be less than or equal to the balance.
	If valid, subtract it from the balance.
	Otherwise, print an appropriate message.
	Example:
	Balance: ₹5000
	Withdraw: ₹2000
	Remaining Balance: ₹3000
*/

import java.util.Scanner;

public class AtmWithdrawal
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int currentBalance = 5000;
		int withdraw;
		int remainingBalance;
		
		System.out.print("Enter your withdraw amount : ");
		withdraw = sc.nextInt();
		
		if(withdraw>0){
			remainingBalance = currentBalance-withdraw;
			System.out.print("Remaining Balance : " +remainingBalance);
		}
		else{
			System.out.print("Withdrawal amount must be greater than 0. Withdrawal amount must be less than or equal to the balance."); 
		}
	}
}