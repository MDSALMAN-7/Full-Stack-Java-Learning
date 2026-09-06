/*
	 Using Switch Statement
	11. Simple Calculator
	Take two numbers and an operator (+, -, *, /, %) from the user.
	Example:
	Enter first number: 20
	Enter operator: *
	Enter second number: 5
	Output: 100
*/

import java.util.Scanner;

public class SimpleCalculator
{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int a = sc.nextInt();
		System.out.print("Enter Operator: ");
		char operation = sc.next().charAt(0);
		System.out.print("Enter second Number: ");
		int b = sc.nextInt();
		
		switch(operation){
			case '+':
				int add = a+b;
				System.out.print("Add : "+add);
				break;
			case '-':
				int sub = a-b;
				System.out.print("Sub : "+sub);
				break;
			case '*':
				int mul = a*b;
				System.out.print("mul : "+mul);
				break;
			case '/':
				int div = a/b;
				System.out.print("div : "+div);
				break;
			case '%':
				int mod = a+b;
				System.out.print("Mod : "+mod);
				break;
				
			default:
				System.out.print("Invalid Input");
				break;
				
		}
		
		
	}
}