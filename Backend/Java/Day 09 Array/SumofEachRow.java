/* 6. Find Sum of Each Row
Given:
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
Find the sum of every row.
Expected:
Row 1 = 6
Row 2 = 15
Row 3 = 24
 */
class SumofEachRow
{
	public static void main(String[] args)
	{
		int[][] arr = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		int row = 1;
		for(int i=0; i<arr.length; i++){
			
			int sum = 0;
			for(int j=0; j<arr[i].length; j++){
				sum += arr[i][j];
			}
			System.out.println("Row "+row+" = "+sum);
			row++;
		}
	}
}