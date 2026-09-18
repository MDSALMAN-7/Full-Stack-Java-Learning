/* 	EmployeeSalaryCalculator

	Take these using command-line arguments:
	Basic salary
	Years of experience

	Create these methods:
	static double calculateBonus(double salary, int experience)
	static double calculateFinalSalary(double salary, double bonus)

	Rules:
	Experience < 2 years → bonus = 5% of salary
	Experience 2–5 years → bonus = 10%
	Experience > 5 years → bonus = 15%

	Then:
	Final Salary = Basic Salary + Bonus

	Example:
	Input:
	30000 6

	Output:
	Bonus = 4500
	Final Salary = 34500 */
	
/* 	EmployeeSalaryCalculator

	Take these using command-line arguments:
	Basic salary
	Years of experience

	Create these methods:
	static double calculateBonus(double salary, int experience)
	static double calculateFinalSalary(double salary, double bonus)

	Rules:
	Experience < 2 years → bonus = 5% of salary
	Experience 2–5 years → bonus = 10%
	Experience > 5 years → bonus = 15%

	Then:
	Final Salary = Basic Salary + Bonus

	Example:
	Input:
	30000 6

	Output:
	Bonus = 4500
	Final Salary = 34500 */
	
class EmployeeSalaryCalculator
{
	static double calculateBonus(double salary, int experience){
		double bonus = 0;
		
		if(experience<2){
			bonus = salary*5/100;
			return bonus;
		}
		else if(experience>2 && experience<5){
			bonus = salary*10/100;
			return bonus;
		}
		else{
			bonus = salary*15/100;
			return bonus;
		}
		
	}
	
	static double calculateFinalSalary(double salary, double bonus){
		double finalSalary = salary+bonus;
		 return finalSalary;
	}
	
	
	public static void main(String[] args)
	{
		double salary = Double.parseDouble(args[0]);
		int exp = Integer.parseInt(args[1]);
		
		double finalBonus = calculateBonus(salary,exp);
		
		System.out.println("Bonus : "+finalBonus);
		System.out.println("Final Salary : "+calculateFinalSalary(salary,finalBonus));
	}
}