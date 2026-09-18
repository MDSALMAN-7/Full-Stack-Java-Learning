/* 	Product Bill

	Take these using command-line arguments:
	Product price
	Quantity
	Discount percentage

	Create a method:
	static double calculateFinalPrice(...)

	The method should:
	Calculate subtotal
	Calculate discount
	Return the final price

	Example:
	Input: 500 3 10
	Output:
	Final Price = 1350.0
	 */
class ProductBill
{
	static double calculateFinalPrice(int product, int quantity, int discount){
		int subTotal = product*quantity;
		double calculateDis = subTotal*discount/100;
		double finalPrice = subTotal-calculateDis;
		return finalPrice;
	}
	
	public static void main(String[] args)
	{
		int product = Integer.parseInt(args[0]);
		int quantity = Integer.parseInt(args[1]);
		int disPer = Integer.parseInt(args[2]);
		
		System.out.print(calculateFinalPrice(product,quantity,disPer));
		
		
	}
}