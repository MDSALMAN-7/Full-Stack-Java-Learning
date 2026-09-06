/*
	1. Print Numbers with continue
	Take a number n from the user and print numbers from 1 to n, but skip all multiples of 3.
*/

import java.util.Scanner;

public class PrintNumbersWithContinue
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int number = sc.nextInt();
		
		for(int i=1; i<=number; i++){
			if(i%3==0){
				continue;
			}
			System.out.println(i);
		}
	}
}	

