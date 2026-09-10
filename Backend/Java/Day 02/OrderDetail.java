/* WAP to print order Id, Product name , placed by, delivery address

ORD11234
Iphone16
kodewala
2nd stage,BTM Layout, Banglore */

public class OrderDetail
{
	public static void main(String[] args)
	{
		String orderId = args[0];
		String pName = args[1];
		String placedBy = args[2];
		String address = args[3];
		
		System.out.println(orderId);
		System.out.println(pName);
		System.out.println(placedBy);
		System.out.println(address);
	}
}