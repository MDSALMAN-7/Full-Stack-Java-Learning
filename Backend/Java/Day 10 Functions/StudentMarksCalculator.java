/* 1. Student Marks Calculator
Take 3 subject marks using command-line arguments.
Create a method:

static int calculateTotal(int a, int b, int c)

Requirements:
Take 3 marks from args
Calculate total using the method
Calculate percentage in main
Print total and percentage

Example:
Input: 80 70 90
Output:
Total = 240
Percentage = 80.0
 */
class StudentMarksCalculator
{
	static int calculateTotal(int a, int b, int c){
		int total = a+b+c;
		return total;
	}
	
	public static void main(String[] args)
	{
		
		int math = Integer.parseInt(args[0]);
		int java = Integer.parseInt(args[1]);
		int sql = Integer.parseInt(args[2]);
		int totalMarks = calculateTotal(math,java,sql);
		double percentage = totalMarks/300.0*100;
		
		System.out.println("Total marks : "+ totalMarks);
		
		System.out.println("Percentage : "+percentage);
	}
}