/* 8. Find Largest Element in Array
Create a method:
findLargest(int[] arr)
Find and return the largest element.
Given:
{10, 45, 23, 67, 12}
Expected:
67 */

class LargestElement
{
	public static void main(String[] args)
	{
		int[] arr = {10, 45, 23, 67, 12};
		System.out.print(largestElement(arr));
		
	}
	
	static int largestElement(int[] arr){
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		return max;
	}
}