// 3. Eligible to Vote

import java.util.Scanner;

public class EligibleVote
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		
		if(age>=18){
			System.out.print("You are Eligible for Voting ");
		}
		else{
			System.out.print("You are not Eligile, You are less than 18");
		}
	}
}
