/* 7. Find Sum of Each Column
Using the same array:
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
Expected:
Column 1 = 12
Column 2 = 15
Column 3 = 18 */

class SumofEachColumn
{
	public static void main(String[] args)
	{
		int[][] arr = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		int col=1; 
		
		for(int i=0; i<arr[0].length; i++){
			int sum = 0; 
			for(int j=0; j<arr.length; j++){
				sum += arr[j][i]; 
			}
			System.out.println("Column " + (i + 1) + " = " + sum);
		}
	}
}