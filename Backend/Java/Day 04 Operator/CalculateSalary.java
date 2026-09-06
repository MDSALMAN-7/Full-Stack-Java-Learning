/*
7. Calculate Salary
An employee has:
Basic salary = ₹30,000
HRA = 20% of basic salary
DA = 10% of basic salary
Tax = 5% of basic salary
Calculate the final salary after tax.
*/

public class CalculateSalary
{
	public static void main(String arg[])
	{
		int basicSalary = 30000;
		/*
		int hra = (basicSalary*20/100);
		int da = (basicSalary*10/100);
		int tax = (basicSalary*5/100);
		*/
		int finalSalary = basicSalary-((basicSalary*20/100)+(basicSalary*10/100)+(basicSalary*5/100));
		
		System.out.println(finalSalary);
	}
	
}