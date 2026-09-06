// 8. Largest of Three Numbers

import java.util.Scanner;

public class LargestThreeNumber
{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First number: ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int b = sc.nextInt();
		System.out.print("Enter 3rd number: ");
		int c = sc.nextInt();
		
		if(a>b && a>c){
			System.out.print(a+" is Largest Number");
		}
		else if(b>c){
			System.out.print(b+" is Largest Number");
		}
		else{
			System.out.print(c+" is Largest Number");
		}
	}
}