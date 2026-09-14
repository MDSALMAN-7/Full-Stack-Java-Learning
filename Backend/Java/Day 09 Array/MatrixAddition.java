/* 17. Matrix Addition
Given:
int[][] a = {
    {1, 2},
    {3, 4}
};
int[][] b = {
    {5, 6},
    {7, 8}
};
Add both matrices.
Expected:
6  8
10 12 */

class MatrixAddition
{
	public static void main(String[] args)
	{
		int[][] a = {
			{1, 2},
			{3, 4}
		};

		int[][] b = {
			{5, 6},
			{7, 8}
		};
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				int sum = a[i][j]+b[i][j];
				System.out.print(sum+ " ");
			}
			System.out.println();
		}
	}
}