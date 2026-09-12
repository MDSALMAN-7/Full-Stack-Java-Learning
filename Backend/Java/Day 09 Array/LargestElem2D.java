/* 3. Find Largest Element
Given:
int[][] arr = {
    {10, 25, 3},
    {45, 12, 8},
    {20, 67, 15}
};
Find the largest element.
Expected:
Largest = 67 */

class LargestElem2D
{
	public static void main(String[] args)
	{
		int[][] arr = {
			{10, 25, 3},
			{45, 12, 8},
			{20, 67, 15}
		};
		
		int larg = arr[0][0];
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				if(larg<arr[i][j]){
					larg = arr[i][j];
				}
			}
		}
		System.out.print(larg);
	}
}