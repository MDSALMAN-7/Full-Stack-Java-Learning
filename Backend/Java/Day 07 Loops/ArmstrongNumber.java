/*
	9. Armstrong Number 🔥
	Take a 3-digit number and check whether it is an Armstrong number.
	Example:
	153
	Because:
	1³ + 5³ + 3³
	= 1 + 125 + 27
	= 153
	Output:
	Armstrong Number
*/

import java.util.Scanner;

public class ArmstrongNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int arm=0;
		int q =0;
		int temp = num;
		
		while(num!=0){
			int lastDigit = num%10;
			num = num/10;
			q = lastDigit*lastDigit*lastDigit;
			arm += q;
		}
		if(temp == arm){
			System.out.print("Armstrong number");
		}
		else{
			System.out.print("Not Armstrong");
		}
	}
}