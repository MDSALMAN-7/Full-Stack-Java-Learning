/* 4. Find Largest Element
Given:
{12, 45, 23, 67, 34}
Find the largest element.
Expected output:
Largest = 67 */

public class LargestElement
{
	public static void main(String[] args)
	{
		int[] element = {12, 45, 23, 67, 34};
		int larNum = element[0];
		for(int i = 0; i<element.length; i++){
			if(larNum <= element[i]){
				larNum = element[i];
			}
		}
		System.out.print(larNum);
	}
}