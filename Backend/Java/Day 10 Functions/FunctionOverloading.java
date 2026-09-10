class FunctionOverloading
{
	public static void main(String[] args) // Main Function
	{
		// Function Overloading 
		int x = sum(2,3);
		System.out.println(x);
		
		int y = sum(5,4);
		System.out.println(y);
		
		int z = sum(3,4,8);
		System.out.println(z);
		
		greet("Saiman",24);
		greet(24,"Saiman");
		
		fun();
		fun2();
		
		
	}
	
	static int sum(int a, int b)
	{
		return (a+b);
	}
	
	static int sum(int a, int b, int c) // Different no. of Parameter
	{
		return (a+b+c);
	}
	
	static int sum(double a, double b) // Different type of parameter
	{
		return (int)(a+b);
	}
	
	static void greet(String name, int age) {
        System.out.println("Hi " + name + ". Your age is " + age);
    }

    static void greet(int age, String name) { // ordering of parameters
        System.out.println("Hi " + name + ". Your age is " + age);
    }

	 static void fun() {
        System.out.println("Hello");
    }

    static int fun2() {
        System.out.println("Hello Fun 2");
        return 0;
	}
}