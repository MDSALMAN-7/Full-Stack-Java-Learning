/* 
	3. Find Average
	Given:
	{10, 20, 30, 40, 50}
	Find the average of the elements.
	Expected output:
	Average = 30.0
 */

public class Average
{
	public static void main(String[] args)
	{
		int[] elements = {10, 20, 30, 40, 50};
		int sum = 0;
		for(int i=0; i<elements.length; i++){
			sum += elements[i];
		}
		int average = sum/elements.length;
		System.out.print(average);
	}
}