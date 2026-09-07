/* 13. Separate Even and Odd
Given:
{10, 15, 22, 31, 40, 55}
Print all even numbers first and then all odd numbers.
Expected output:
Even: 10 22 40
Odd: 15 31 55 */

public class SeparateEvenOdd
{
	public static void main(String[] args)
	{
		int[] num = {10, 15, 22, 31, 40, 55};
		int[] even = new int[3];
		
		for(int i=0; i<num.length; i++){
			if(num[i]%2==0){
				for(int e=0; e<num[i]; e++){
					System.out.print("Even: "+even[e]+" ");
				}
			}
		}
		
	}
}