/*
	3. Multiplication Table with break
	Take a number from the user and print its multiplication table.
	But stop printing when the result becomes greater than 50
	Example:
	Input: 8
	8 × 1 = 8
	8 × 2 = 16
	8 × 3 = 24
	8 × 4 = 32
	8 × 5 = 40
	8 × 6 = 48
*/

import java.util.Scanner;

public class TableWithBreak
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int mul = 0;
		
		
		for(int i =1; ; i++){
			
			mul = num*i;
			
			if(mul>50){
				break;
			}
			System.out.println(mul);
			
		}
		
	}
}