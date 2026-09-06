/* 7. Search an Element
Given:
{10, 20, 30, 40, 50}
Take a number from the user and check whether that number exists in the array.
Example:
Enter number: 30
30 is present */

import java.util.Scanner;
public class SearchElement
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] element = {10, 20, 30, 40, 50};
		System.out.print("Enter Element : ");
		int num = sc.nextInt();
		
		boolean found = false;
		
		for(int i=0; i<element.length; i++){
			if(element[i] == num){
				System.out.print("Number Found");
				found = true;
				break;
			}
		}
		if(!found){
			System.out.print("Number doesn't exists");
		}
	}
}