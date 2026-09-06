// 10. Grade Calculator
/* 90–100 → A
	80–89  → B
	70–79  → C
	60–69  → D
	Below 60 → F
*/

import java.util.Scanner;

public class GradeCalculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter you Marks : ");
		int marks = sc.nextInt();
		
		if(marks>= 90 && marks<=100){
			System.out.print("Grade A");
		}
		else if(marks>= 80 && marks<=89){
			System.out.print("Grade B");
		}
		else if(marks>= 70 && marks<=79){
			System.out.print("Grade C");
		}
		else if(marks>= 60 && marks<=70){
			System.out.print("Grade D");
		}
		else if(marks>60){
			System.out.print("Fail");
		}
		else{
			System.out.print("Invalid Number");
		}
	}
}