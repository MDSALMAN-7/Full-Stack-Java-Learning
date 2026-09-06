// 5. Pass or Fail

import java.util.Scanner;

public class PassFail
{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		
		int passMarks = 40;
		System.out.print("Enter Marks : ");
		int marks = sc.nextInt();
		
		if(marks>=40){
			System.out.print("Pass");
		}
		else{
			System.out.print("Fail");
		}
	}
}