/*
	4. Multiplication Table
	Take a number from the user and print its multiplication table from 1 to 10.
*/

import java.util.Scanner;
public class WhileTable
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int table;
		System.out.print("Enter Number for printing Table: ");
		int number = sc.nextInt();
		
		while(i<=10){
			table = number*i;
			System.out.println(number+" X "+i+" = "+table);
			i++;
		}
	}
}