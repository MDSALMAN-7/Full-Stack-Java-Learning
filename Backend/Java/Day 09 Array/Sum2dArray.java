/* 2. Find Sum of All Elements
Given:
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
Find the sum of all elements.
Expected:
Sum = 45 */

class Sum2dArray
{
	public static void main(String[] args)
	{
		int[][] arr = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		int sum = 0;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				sum += arr[i][j];
			}
		}
		System.out.print("Sum :"+sum);
	}
}