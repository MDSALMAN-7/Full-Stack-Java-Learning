public class Functions
{
	public static void main(String[] args)
	{
		// Calling function
		greet();
		sayHello("Saiman"); // Arguments
		
		int x = getNumber();
		System.out.println(x);
		
		System.out.println(multiply(2,3));
		
	}
	
	// Funtions
	
	// No IP, No OP
	static void greet(){
		System.out.println("Hello");
		return; // optional 
	}
	
	// IP, No OP
	static void sayHello(String name)
	{
		System.out.println("Hello "+name);
	}
	
	// No ip,OP
	static int getNumber()
	{
		return 10;
	}
	
	// IP, OP
	static int multiply(int a, int b){
		return(a*b);
	}
}