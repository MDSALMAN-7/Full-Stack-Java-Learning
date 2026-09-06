// 10.Strong Challenge — Guess the Number

import java.util.Scanner;

public class GuessNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int correct = 25;
		int guess =0;
		while(correct != guess){
			System.out.print("Guess : ");
			guess = sc.nextInt();
			
			if(correct == guess){
				System.out.println("Correct !");
			}
			else if(correct >= guess){
				System.out.print("Too low");
			}
			else{
				System.out.print("Too high");
			}
		}
	}
}