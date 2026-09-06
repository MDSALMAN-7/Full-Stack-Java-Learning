/*
13. Calculate Electricity Bill
Assume:
Units = 350
Price per unit = ₹7
Fixed charge = ₹100
Calculate the total electricity bill.
*/

public class CalculateElectricityBill
{
	public static void main(String arg[])
	{
		int units = 350;
		int pricePerUnit = 7;
		int fixedCharge = 100;
		
		int totalBill = fixedCharge + (units*pricePerUnit);
		
		System.out.println(totalBill);
	}
}