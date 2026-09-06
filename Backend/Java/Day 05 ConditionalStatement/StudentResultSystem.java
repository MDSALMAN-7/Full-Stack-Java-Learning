/*
	20.Student Result System
	1.Calculate total marks.
	2.Calculate percentage.
	3.Determine the grade.
	4.Check whether the student passed or failed.
*/

import java.util.Scanner;

public class StudentResultSystem
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Math marks : ");
		int math = sc.nextInt();
		System.out.print("Enter Englsih marks : ");
		int english = sc.nextInt();
		System.out.print("Enter Hindi marks : ");
		int hindi = sc.nextInt();
		System.out.print("Enter Urdu marks : ");
		int urdu = sc.nextInt();
		System.out.print("Enter java marks : ");
		int java = sc.nextInt();
		
		int totalMarks = math+english+hindi+urdu+java;
		System.out.println("Total Marks : "+totalMarks);
		
		float percentage = totalMarks*100/500f;
		System.out.println("Percantage : "+percentage);
		
		if(percentage>= 90 && percentage<=100){
			System.out.print("Grade A");
		}
		else if(percentage>= 80 && percentage<=89){
			System.out.print("Grade B");
		}
		else if(percentage>= 70 && percentage<=79){
			System.out.print("Grade C");
		}
		else if(percentage>= 60 && percentage<=70){
			System.out.print("Grade D");
		}
		else{
			System.out.print("Fail");
		}
		
	}
}