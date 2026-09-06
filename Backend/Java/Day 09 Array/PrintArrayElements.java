
	/* 1. Print Array Elements
	Create an integer array:
	{10, 20, 30, 40, 50}
	Print all elements using a for loop. */
	
public class PrintArrayElements
{
	public static void main(String[] args)
	{
		int [] numbers = {10, 20, 30, 40, 50};
		
		for(int i = 0; i<numbers.length; i++){
			System.out.print(numbers[i]+ " ");
		}
	}
}