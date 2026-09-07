/* 8. Count Positive, Negative and Zero
Given:
{10, -5, 0, 20, -8, 0, 15}
Count:
Positive numbers
Negative numbers
Zeros */

public class CountPosNegZero
{
	public static void main(String[] args)
	{
		int[] num = {10, -5, 0, 20, -8, 0, 15};
		int pos=0;
		int neg =0;
		int zero=0;
		
		for(int i = 0; i<num.length; i++){
			if(num[i]>0){
				pos++;
			}
			else if(num[i]<0){
				neg++;
			}
			else{
				zero++;
			}
		}
		System.out.println("Positive Count: "+pos);
		System.out.println("Negative Count: "+neg);
		System.out.println("Zero Count: "+zero);
	}
}