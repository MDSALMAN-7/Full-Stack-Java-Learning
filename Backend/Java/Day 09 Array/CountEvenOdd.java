/*6. Count Even and Odd Numbers
Given:
{10, 15, 22, 31, 40, 55}
Count how many numbers are even and how many are odd.
Expected output:
Even = 3
Odd = 3
 */
public class CountEvenOdd
{
	public static void main(String[] arg){
		int[] numbers = {10, 15, 22, 31, 40, 55};
		int countEven=0;
		int countOdd= 0;
		
		for(int i=0; i<numbers.length; i++){
			if(numbers[i]%2==0){
				countEven++;
			}
			else{
				countOdd++;
			}
		}
		System.out.println(countEven);
		System.out.println(countOdd);
	}
}