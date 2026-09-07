/* 12. Count Occurrences
Given:
{10, 20, 10, 30, 10, 40, 20}
Take a number from the user and count how many times it appears
Example:
Enter number: 10
10 appears 3 times */

import java.util.Scanner;
public class CountOccurrences
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] ele = {10, 20, 10, 30, 10, 40, 20};
		int count=0;
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		
		for(int i=0; i<ele.length; i++){
			if(ele[i]==num){
				count++;
			}
		}
		System.out.print(count+" times");
		
		
	}
}