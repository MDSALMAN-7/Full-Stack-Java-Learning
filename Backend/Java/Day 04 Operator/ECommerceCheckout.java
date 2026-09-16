/* 	E-Commerce Checkout — Challenge

	Create a checkout calculation for an online shopping website.

	Take:

	Product Price
	Quantity
	Discount %
	GST %
	Delivery Charge

	Calculate:

	Subtotal = Price × Quantity
	Discount Amount = Subtotal × Discount%
	Price After Discount = Subtotal - Discount
	GST = Price After Discount × GST%
	Final Amount = Price After Discount + GST + Delivery Charge
	
	Then use the ternary operator:
	Final Amount >= 5000
	→ Free Delivery

	Otherwise
	→ Delivery charge applies

	Print a small bill:
	Product Price:
	Quantity:
	Subtotal:
	Discount:
	GST:
	Delivery:
	Final Amount: */
	
	
class ECommerceCheckout
{
	public static void main(String[] args)
	{
		int productPrice = Integer.parseInt(args[0]);
		int quantity = Integer.parseInt(args[1]);
		double discountPercent = Double.parseDouble(args[2]);
		byte gstPercent = 18;
		int deliveryCharge = 49;
		
		int subTotal = productPrice*quantity;
		double disAmount = subTotal*discountPercent/100;
		double afterdiscount = subTotal-disAmount;
		double gst = afterdiscount*gstPercent/100;
		double totalPrice = afterdiscount+gst;
		
		String divCharge = totalPrice>=5000?"Free":""+deliveryCharge;
		
		String finalPrice = totalPrice >= 5000 
			? "Final Price : " + totalPrice 
			: "Final Price : " + (totalPrice + deliveryCharge);	
			
		System.out.println("Bill...");
		System.out.println("Product Price : "+productPrice);
		System.out.println("Quantity : "+quantity);
		System.out.println("SubTotal : "+subTotal);
		System.out.println("Discount : "+disAmount);
		System.out.println("GST : "+gst);
		System.out.println("Delivery : "+divCharge);
		System.out.println(finalPrice);
		
		
	}
}