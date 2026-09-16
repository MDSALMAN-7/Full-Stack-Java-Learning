/* 	Employee Salary Calculator

	Take:
	Basic salary
	HRA percentage
	DA percentage
	Tax percentage

	Calculate:
	HRA = Basic Salary × HRA%
	DA = Basic Salary × DA%
	Gross Salary = Basic + HRA + DA
	Tax = Gross Salary × Tax%
	Net Salary = Gross Salary - Tax

	Print all values.

	Challenge: Use the ternary operator to give a ₹2,000 bonus if the basic salary is greater than ₹50,000.*/

class EmployeeSalaryCalculator 
{
	public static void main(String[] args)
	{
		int basicSalaray = Integer.parseInt(args[0]);
		int hra = 20;
		int da = 10;
		int tax = 5;
		
		System.out.println("Basic salary : "+basicSalaray);
		System.out.println("HRA : "+hra+"%");
		System.out.println("DA : "+da+"%");
		System.out.println("Tax : "+tax+"%");
		System.out.println();
		
		int resulthra = basicSalaray*hra/100;
		int resultda = basicSalaray*da/100;
		
		
		int grossSalary = basicSalaray+resulthra+resultda;
		int resulttax = grossSalary*tax/100;
		
		System.out.println("HRA = "+resulthra);
		System.out.println("DA = "+resultda);
		System.out.println("Gross Salary = "+grossSalary);
		System.out.println("TAX = "+resulttax);
		
		int bonus = 2000;
		
		String netSaralry = basicSalaray>=50000 ? "Bonus = "+bonus :"";
		
		String netSalary = basicSalaray>=50000 ? "Net Salary = "+((grossSalary-resulttax)+bonus) : "Net Salary = "+(grossSalary-resulttax);
		System.out.println(netSalary);
		
		
		
	}
}