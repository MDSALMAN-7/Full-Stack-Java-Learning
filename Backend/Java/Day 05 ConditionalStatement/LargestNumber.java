// 4. Largest of Two Numbers

import java.util.Scanner;

public class LargestNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		int b = sc.nextInt();
		
		if(a>b){
			System.out.print(a+" is large");
		}
		else if(a == b){
			System.out.print("Both are same");
		}
		else{
			System.out.print(b+" is large");
		}
	}
}

