/* 3.Taxi Fare Calculator

Take:
Distance in kilometers
Price per kilometer
Calculate the basic fare.

Then apply a fixed booking charge of ₹50.

Use the ternary operator:
If distance > 10 km
    Extra charge = ₹100
Otherwise
    Extra charge = ₹0
	
Print the final taxi fare. */

class TaxiFareCalculator
{
	public static void main(String[] args)
	{
		int fixedCharge = 50;
		int distance = Integer.parseInt(args[0]);
		int priceKM = Integer.parseInt(args[1]);
		
		System.out.println("Distance in Kilometer : "+distance);
		System.out.println("Price per Kilometer : "+priceKM);
		
		int fare = distance*priceKM;
		
		String finalPrice = distance>10?"Total fare : "+(fare+100):"Total fare : "+fare;
		System.out.println(finalPrice);
		
	}
}

