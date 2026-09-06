/*
	2. Sum Until a Limit
	Take a number n from the user and calculate the sum from 1 to n.
	But stop the loop immediately when the sum becomes greater than 100.
	Example:
	Input: 20
	Output:
	Sum = 105
	Requirement: Use for and break.
*/

import java.util.Scanner;

public class SumUntilLimit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=num; i++){
			sum+=i;
			if(sum>100){
				break;
			}
		}
		System.out.print(sum);
	}
}