/* 5. Find Smallest Element
Given:
{12, 45, 23, 67, 34}
Find the smallest element.
Expected output:
Smallest = 12 */

public class SmallestElement
{
	public static void main(String[] args)
	{
		int[] element = {12, 45, 23, 67, 34};
		int smallEle = element[0];
		
		for(int i=0; i<element.length; i++){
			if(smallEle>=element[i]){
				smallEle = element[i];
			}
		}
		System.out.print(smallEle);
	}
}