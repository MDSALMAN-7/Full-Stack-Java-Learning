/* 15. Remove Duplicate Elements
Given:
{10, 20, 10, 30, 20, 40, 30}
Print only the unique elements
Expected output:
10 20 30 40
Hint: You can use nested loops */

public class RemoveDuplicateElement
{
	public static void main(String[] args)
	{
		int[] elem = {10, 20, 10, 30, 20, 40, 30};
		
		
		for(int i=0; i<elem.length; i++){
			boolean duplicate = false;
			for(int j = 0; j<i; j++){
				if(elem[i]==elem[j]){
					duplicate=true;
					break;
				}
			}
			if (!duplicate) {
                System.out.print(elem[i] + " ");
            }
		}
	}
}