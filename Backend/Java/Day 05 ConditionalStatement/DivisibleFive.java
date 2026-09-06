//6. Divisible by 5

import java.util.Scanner;

public class DivisibleFive
{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int number = sc.nextInt();
		
		if(number%5==0){
			System.out.print("Disible by 5 ");
		}
		else{
			System.out.print("Not disible by 5");
		}
	}
}