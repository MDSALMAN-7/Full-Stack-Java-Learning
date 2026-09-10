class Factorial
{
	public static void main(String[] args)
	{
		factorial(5);
	}
	
	static void factorial(int n){
		int fact = 1; 
		while(n>0){
			fact *= n;
			n--;
		}
		System.out.print(fact);
	}
}