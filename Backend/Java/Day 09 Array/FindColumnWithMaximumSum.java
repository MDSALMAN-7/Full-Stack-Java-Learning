/* 16. Find Column With Maximum Sum
Given:
int[][] arr = {
    {10, 20, 30},
    {40, 50, 60},
    {5, 10, 15}
};
Find which column has the maximum sum.
Expected:
Column 3 has maximum sum = 105 */

class FindColumnWithMaximumSum
{
	public static void main(String[] arg)
	{
		int[][] arr = {
			{10, 20, 30},
			{40, 50, 60},
			{500, 80, 15}
		};
		int maxSum = 0;
		int maxCol = 0;
		
		for(int i=0; i<arr[0].length; i++){
			int sum = 0; 
			for(int j=0; j<arr.length; j++){
				sum+=arr[j][i];
			}
			
			if(sum>maxSum){
				maxSum = sum;
				maxCol++;
			}
		}
		System.out.print("Column "+(maxCol)+" has maximum sum = "+maxSum);
	}
}