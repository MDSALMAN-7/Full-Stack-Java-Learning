/* 20. Find the Second Smallest Element
Given:
{25, 10, 45, 5, 30, 15
Find the second smallest element without sorting the array.
Expected output:
Second smallest = 10 */

public class SecondSmallestElement
{
	public static void main(String[] args)
	{
		int[] arr = {25, 10, 45, 5, 30, 15};
		
		int min1 = arr[0]; // 25
		int min2 = arr[1]; // 10
		
		if(arr[0]<arr[1]){
			min1 = arr[0]; 
			min2 = arr[1];
		}
		else{
			min2 = arr[0]; // 25
			min1 = arr[1]; // 10
		}
		
		for(int i=2; i<arr.length; i++){
			if(arr[i]<min1){
				min2 = min1;
				min1 = arr[i];
			}
			else if(arr[i]<min2){
				min2 = arr[i];
			}
		}
		System.out.print(min2);
	}
}