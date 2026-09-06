/*
	10. Number Guessing — Limited Attempts
	Create a number-guessing game.
	Set:
	int secretNumber = 25;
	Give the user 5 attempts to guess the number.
	Rules:
	Correct → print "Correct!" and stop using break.
	Guess is too high → print "Too High".
	Guess is too low → print "Too Low".
	After 5 wrong attempts → print "Game Over".

	Example:
	Attempt 1: 10
	Too Low
	Attempt 2: 30
	Too High
	Attempt 3: 25
	Correct!
	
	Requirement: Use:
	for
	break
	if-else
	Scanner
*/

import java.util.Scanner;

public class GuessGame
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int secretNumber = 25;
		int num=0;
		int i;
		
		for( i=1; i<=5; i++){
			System.out.print("Attempt "+i+": ");
			num = sc.nextInt();
			
			if(secretNumber == num){
				System.out.println("Correct !");
				break;
			}
			else if(num>secretNumber){
				System.out.println("Too High");
			}
			else if(num<secretNumber){
				System.out.println("Too low");
			}
			
		}
		if(i==5){
			System.out.print("Game Over");
		}
		
		
	}
}