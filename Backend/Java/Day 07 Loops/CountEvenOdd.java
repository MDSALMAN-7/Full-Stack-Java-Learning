/*	
	4. Count Even and Odd Numbers
	Take n from the user.
	Print the numbers from 1 to n and count:
	How many are even
	How many are odd
	Example:
	Input: 10
	Even count = 5
	Odd count = 5
*/

import java.util.Scanner;

public class CountEvenOdd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int countEven = 0;
		int countOdd = 0;
		
		for(int i=1; i<=num; i++){
			if(i%2==0){
				countEven++;
			}
			else{
				countOdd++;
			}
		}
		System.out.println("Even Count: "+countEven);
		System.out.println("Odd Count: "+countOdd);
		
	}
}