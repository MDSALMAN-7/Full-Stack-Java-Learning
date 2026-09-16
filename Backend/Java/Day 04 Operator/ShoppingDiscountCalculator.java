/* 2. Shopping Discount Calculator
A customer buys a product.
Take:
Product price
Quantity
Discount percentage

Calculate:

Total price
Discount amount
Final amount

Example:
Price = 500
Quantity = 3
Discount = 10%

Total = 1500
Discount = 150
Final Amount = 1350

Challenge: Use the ternary operator to give an additional
"Premium Customer Discount" of ₹100 if the final amount is greater than ₹2000. */

class ShoppingDiscountCalculator
{
	public static void main(String[] arg)
	{
		int price = Integer.parseInt(arg[0]);
		int quantity = Integer.parseInt(arg[1]);
		int discount = Integer.parseInt(arg[2]);
		
		System.out.println("Product price = "+price);
		System.out.println("Quantity = "+quantity);
		System.out.println("Discount = "+discount);
		System.out.println();
		
		int total = price*quantity;
		int finalPrice = total-(total*discount/100);
		System.out.println("Total = "+total);
		System.out.println("Discount = "+(total*discount/100));
		System.out.println("Final Amount = "+finalPrice);
		
		String offer = finalPrice>2000?"Premium Customer Discount Calculater : "+(finalPrice-100):"";
		System.out.println(offer);
		
		
		
		
		
	}
}