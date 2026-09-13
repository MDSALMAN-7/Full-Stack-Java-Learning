/* 14. Transpose of a Matrix
Given:
1 2 3
4 5 6
Print its transpose:
1 4
2 5
3 6
Hint: Rows become columns. */


class TransposeMatrix
{
	public static void main(String[] args)
	{
		int[][] arr = {
			{1,2,3},
			{4,5,6}
		};
		
		// for(int i=0; i<arr[0].length; i++){
			// for(int j=0; j<arr.length; j++){
				// System.out.print(arr[j][i]);
			// }
			// System.out.println(); 
		// }
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
}