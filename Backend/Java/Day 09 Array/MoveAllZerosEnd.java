/* 19. Move All Zeros to the End
Given:
{0, 10, 0, 20, 30, 0, 40}
Move all zeros to the end while keeping the order of other elements.
Expected output:
10 20 30 40 0 0 0 */


public class MoveAllZerosEnd
{
	public static void main(String[] args)
	{
		int[] arr = {0, 10, 0, 30, 27, 0, 40}; 
		
		int[] result = new int[arr.length];
		
		int index = 0;
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]!=0){
				result[index] = arr[i];
				index++;
			}
		}	
		for(int i=0; i<result.length; i++){
			System.out.print(result[i]+ " ");
		}
	}
}