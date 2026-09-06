// 7. Check Character

import java.util.Scanner;

public class CheckCharacter
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Character : ");
		char c = sc.next().charAt(0);
		
		if(c=='A'){
			System.out.print("yes, it is A");
		}
		else{
			System.out.print("No, it is not A");
		}
	}
}