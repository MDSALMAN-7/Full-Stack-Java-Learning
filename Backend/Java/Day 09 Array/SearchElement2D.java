/*12. SearchElement
Take a number from the user and search for it in:
int[][] arr = {
    {10, 20, 30},
    {40, 50, 60},
    {70, 80, 90}
};
Example:
Enter number: 50
Expected:
Element found */


import java.util.Scanner;

class SearchElement2D
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[][] arr = {
			{10, 20, 30},
			{40, 50, 60},
			{70, 80, 90}
		};
		
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		boolean element = false;
		
		for(int i=1; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				if(arr[i][j] == num){
					element = true;
					System.out.print("Element Found ");
					break;
				}
			}
			
		}
		if(!element){
			System.out.print("Element Not Found");
		}
		
	}
}