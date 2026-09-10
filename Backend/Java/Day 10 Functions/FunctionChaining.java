// Function of Chaining
class FunctionChaining
{
	public static void main(String[] args)
	{
		fun1();
	}
	static void fun1(){
		fun2();
		System.out.println("Hi");
	}
	static void fun2(){
		fun3();
		System.out.println("Hello");
	}
	static void fun3(){
		System.out.println("How are you bro");
	}
}