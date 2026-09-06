/* 
	2. Find Sum of Elements
	Given:
	{10, 20, 30, 40, 50}
	Find and print the sum of all elements.
	Expected output:
	Sum = 150 
*/

public class SumOfElements
{
	public static void main(String[] args)
	{
		int[] elements = {10, 20, 30, 40, 50};
		int sum = 0;
		for(int i=0; i<elements.length; i++){
			sum += elements[i];
		}
		System.out.print(sum);
	}
}