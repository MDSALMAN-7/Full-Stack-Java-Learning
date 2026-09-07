/* 10. Copy an Array
Given:
int[] arr = {10, 20, 30, 40, 50};
Create another array and copy all elements from the first array into it.
Expected output:
10 20 30 40 50 */

public class CopyArray
{
	public static void main(String[] arg)
	{
		int[] arr = {10, 20, 30, 40, 50};
		int[] copy = new int[arr.length];
		
		for(int i=0; i<arr.length; i++){
			copy[i] = arr[i];
			System.out.print(copy[i] +" ");
		}
	}
}