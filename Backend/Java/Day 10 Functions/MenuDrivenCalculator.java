	/* 20. Menu-Driven Calculator 
	Create separate methods:
	add()
	subtract()
	multiply()
	divide()
	
	Take two numbers and a choice from the user:
	1. Add
	2. Subtract
	3. Multiply
	4. Divide
	Use switch to call the correct method.

	Example:
	Enter first number: 20
	Enter second number: 5
	1. Add
	2. Subtract
	3. Multiply
	4. Divide
	Enter choice: 3
	Output: 100 */
	
import java.util.Scanner;
public class MenuDrivenCalculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter Second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("What do you want to Perform");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		
		System.out.print("Enter Choice : ");
		int choice = sc.nextInt();
		
		switch(choice){
			case 1:
				add(num1, num2);
				break;
			case 2:
				subtract(num1,num2);
				break;
			case 3:
				multiply(num1,num2);
				break;
			case 4:
				divide(num1,num2);
				break;
			default :
				System.out.print("Enter valid value...");
		}
		
	}
	
	static void add(int num1, int num2){
		int sum = num1 + num2;
		System.out.print(sum);
	}
	
	static void subtract(int num1, int num2){
		int sub = num1 - num2;
		System.out.print(sub);
	}
	static void multiply(int num1, int num2){
		int mul = num1*num2;
		System.out.print(mul);
	}
	static void divide(int num1, int num2){
		int div = num1/num2;
		System.out.print(div);
	}
}

