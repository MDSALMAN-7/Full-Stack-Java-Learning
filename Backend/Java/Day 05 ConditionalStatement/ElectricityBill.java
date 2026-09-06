/*
	14. Electricity Bill
	Take electricity units from the user.
	Calculate the bill using:
	0–100 units    → ₹5 per unit
	101–200 units  → ₹7 per unit
	Above 200      → ₹10 per unit
	For now, use a single applicable rate based on the total units, not slab-wise billing.
*/


import java.util.Scanner;
public class ElectricityBill
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int bill;
		System.out.print("Enter you unit : ");
		int unit = sc.nextInt(); 
		
		if(unit<=100){
			bill = unit*5;
			System.out.print("Total electricity bill: "+bill);
		}
		else if(unit<=200){
			bill = 100 * 5 + (unit-100)*7;
			System.out.print("Total electricity bill: "+bill);
		}
		else{
			bill = 100*5 + 100*7 +(unit-200)*10;
			System.out.print("Total electricity bill: "+bill);
		}
	}
}