/* 15. Find Row With Maximum Sum 
Given:
int[][] arr = {
    {10, 20, 30},
    {40, 50, 60},
    {5, 10, 15}
};
Find which row has the maximum sum.
Expected:
Row 2 has maximum sum = 150 */

class FindRowWithMaximumSum
{
	public static void main(String[] arg)
	{
		int[][] arr = {
			{10, 20, 30},
			{40, 50, 60},
			{5, 10, 150}
		};
		
		int maxSum = 0;
		int maxRow = 0;
		
		
		for(int i = 0;  i<arr.length; i++){
			int sum =0;
			for(int j=0; j<arr[i].length; j++){
				sum += arr[i][j];
				
			}
			if(sum>maxSum){
				maxSum=sum;
				maxRow = i;
			}
		}
		System.out.print("Row "+(maxRow+1)+ " has maximum sum = "+maxSum);
	}
}