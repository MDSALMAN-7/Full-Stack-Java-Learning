/* 9. Reverse an Array
Given:
{10, 20, 30, 40, 50}
Print the elements in reverse order.
Expected output:
50 40 30 20 10 */

public class ReverseArray
{
	public static void main(String[] args)
	{
		int[] arr= {10, 20, 30, 40, 50};
		for(int i = arr.length-1; i>=0; i--){
			System.out.print(arr[i]+" ");
		}
		
	}
}