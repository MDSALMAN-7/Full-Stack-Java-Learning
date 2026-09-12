/* 5. Count Even and Odd Numbers
Given:
int[][] arr = {
    {10, 15, 20},
    {25, 30, 35},
    {40, 45, 50}
};
Count the number of even and odd elements.
Expected:
Even = 5
Odd = 4 */

class CountEvenOdd2D
{
	public static void main(String[] args)
	{
		int[][] arr = {
			{10, 15, 20},
			{25, 30, 35},
			{40, 45, 50}
		};
		
		int countE = 0;
		int countO = 0;
		
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				if(arr[i][j]%2==0){
					countE++;
				}
				else{
					countO++;
				}
			}
		}
		System.out.println("Even : "+countE);
		System.out.println("Odd : "+countO);

	}
}
