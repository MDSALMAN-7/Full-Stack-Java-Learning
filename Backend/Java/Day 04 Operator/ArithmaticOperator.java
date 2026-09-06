public class ArithmaticOperator
{
	public static void main(String args[])
	{
		// Arithmatic Operator --> (+,-,*,/,%,+=,-=,*=,/=,++,--)
		int a = 10;
		int b = 5;
		
		int add = a + b; // 15
		int sub = a - b;
		int mul = a*b;
		int div = a / b;
		int modules = a %b;
		
		System.out.println(add +","+ sub +","+ mul +","+ div +","+ modules);
		
		int c = 4;
		c+=5;
		System.out.println(c);
		
		// Increment & Decremet 
		
		int i = 5;
		int d = 5;
		
		i++; // Postfix Increment
		d--; // Postfix Decrement
		
		System.out.println(i +","+ d);
		
		// Postfix and Prefix Increment/decrement
		
		
		
		
	}
}