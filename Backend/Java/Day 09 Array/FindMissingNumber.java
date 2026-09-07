/* 17. Find Missing Number
You have numbers from 1 to 10, but one number is missing.
{1, 2, 3, 4, 5, 6, 8, 9, 10}
Find the missing number.
Expected output:
Missing number = 7 */

public class FindMissingNumber
{
	public static void main(String[] args)
	{
		int[] num = {1, 2, 3, 4, 5, 6, 8, 9, 10};
		int expectedSum = 0;
		int sum = 0;
		for(int i=1; i<=10; i++){
			expectedSum += i;
		}
		for(int i=0; i<num.length; i++){
			sum += num[i];
		}
		
		int missNumber = expectedSum-sum;
		System.out.print(missNumber);
	}
}