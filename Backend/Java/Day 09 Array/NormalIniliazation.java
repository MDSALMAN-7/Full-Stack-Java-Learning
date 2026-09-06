public class NormalIniliazation
{
	public static void main(String[] args)
	{
		// 1-D Array
		/* int[] rollNums = {101,102,103};
		for(int i = 0; i<rollNums.length; i++){
			System.out.println(rollNums[i]);
		} */
		
		// 2-D Array
		int [][] rollNums = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		
		for(int row=0; row<rollNums.length; row++){
			for(int col = 0; col<rollNums[row].length; col++){
				System.out.print(rollNums[row][col] + " ");
			}
			System.out.println();
		}
	}
}