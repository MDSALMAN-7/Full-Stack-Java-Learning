/* 18. Find Pair with Given Sum
Given:
{2, 7, 11, 15, 3, 6}
Take a number from the user and find two elements whose sum equals that number.
Example:
Enter target: 9
Expected output:
2 + 7 = 9
3 + 6 = 9
Hint: Use nested for loops. */

/* import java.util.Scanner;
public class FindPairWithGivenSum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] num = {2, 7, 11, 15, 3, 6};
		System.out.print("Enter Target: ");
		int number = sc.nextInt();
		// int sum = 0;
		for(int i = 0; i<num.length; i++){
			boolean target = false;
			for(int j=0; j<i; j++){
				if(num[i]+num[j] == number){
					target = true;
					break;
				}
				if(target){
					System.out.println(num[i]+ "+" +num[j]+ "="+ number); 
				}
			}	
			
		}
		
	}
}
 */
 
 
 import java.util.Scanner;
public class FindPairWithGivenSum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] num = {2,7,11,15,3,6};
		
		System.out.print("Enter Target : ");
		int target = sc.nextInt();
		
		for(int i=0; i<num.length; i++){
			for(int j=i+1; j<num.length; j++){
				if(num[i] + num[j] == target){
					System.out.println(num[i]+"+"+num[j]+ "=" +target);
				}
			}
		}
	}
} 


/* import java.util.Scanner;

public class FindPairWithGivenSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = {2, 7, 11, 15, 3, 6};

        System.out.print("Enter Target: ");
        int target = sc.nextInt();

        for (int i = 0; i < num.length; i++) {

            for (int j = i + 1; j < num.length; j++) {

                if (num[i] + num[j] == target) {
                    System.out.println(num[i] + " + " + num[j] + " = " + target);
                }
            }
        }
    }
} */