/* 18. MatrixSubtraction
Given:
int[][] a = {
    {10, 20},
    {30, 40}
};
int[][] b = {
    {1, 2},
    {3, 4}
};
Subtract b from a.
Expected:
9  18
27 36 */

class MatrixSubtraction
{
	public static void main(String[] args)
	{
		int[][] a = {
			{10, 20},
			{30, 40}
		};

		int[][] b = {
			{1, 2},
			{3, 4}
		};
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				int sub = a[i][j]- b[i][i];
				
				System.out.print(sub +" ");
			}
			System.out.println();
		}
	}
}