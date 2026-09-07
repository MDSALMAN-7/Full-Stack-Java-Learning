/* 16. Find Duplicate Elements
Given:
{10, 20, 30, 20, 40, 10, 50}
Find and print the elements that appear more than once.
Expected output:
Duplicate elements:
10 20 */

public class FindDuplicateElement
{
	public static void main(String[] args)
	{
		int[] elem = {10, 20, 30, 20, 40, 10, 50};
		
		for(int i = 0; i<elem.length; i++){
			boolean duplicate = true;
			for(int j=0; j<i; j++){
				if(elem[i]==elem[j]){
					duplicate = false;
					break;
				}
			}
			if(!duplicate){
				System.out.print(elem[i]+" ");
			}
		}
	}
}