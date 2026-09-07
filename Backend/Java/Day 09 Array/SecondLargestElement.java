/* 11. Find Second Largest Element
Given:
{10, 25, 45, 30, 60, 50}
Find the second largest element.
Expected output:
Second largest = 50 */


public class SecondLargestElement
{
	public static void main(String[] arg)
	{
		int[] element= {10, 25, 45, 30, 60, 50};
		int max1 = element[0];
		int max2 = element[1];
		
		if(element[0]>element[1]){
			max1=element[0];
			max2 = element[1];
		}
		else{
			max2 = element[0];
			max1 = element[1];
		}
		
		for(int i=2; i<element.length; i++){
			if(element[i]>max1){
				max2 = max1;
				max1 = element[i];
			}
			else if(element[i]>max2){
				max2 = element[i];
			}
		}
		System.out.print("Second Largest Element : "+max2);
	}
}