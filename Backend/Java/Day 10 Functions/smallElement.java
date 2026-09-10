/* 9. Find Smallest Element in Array
Create:
findSmallest(int[] arr)
Given:
{25, 10, 45, 5, 30}
Expected:
5 */

class smallElement
{
	public static void main(String[] args)
	{
		int[] arr = {25, 10, 45, 5, 30};
		System.out.print(smallNum(arr));
	}
	
	static int smallNum(int[] arr){
		int min = arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		return min;
	}
}