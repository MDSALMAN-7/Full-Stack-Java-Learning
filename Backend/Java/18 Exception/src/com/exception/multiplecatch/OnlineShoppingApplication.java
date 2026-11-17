/*Q5 – Online Shopping Application
Create an Order class.

Variables:
String customerName;
int[] productPrices = {500, 1000, 1500};
int quantity;


Requirements:
1. Access the customer name using .length().
2. Access product price using an array index.
3. Calculate total price using productPrice * quantity.
4. Calculate discount using division.
5. Handle:
   - NullPointerException
   - ArrayIndexOutOfBoundsException
   - ArithmeticException
6. Print "Order processing completed".*/


package com.exception.multiplecatch;

public class OnlineShoppingApplication {

    public static void main(String[] args) {

        Order order = new Order("Salman", new int[]{500, 1000, 1500}, 4);

        try {
            order.doOperation();
        }
        catch (NullPointerException e) {
            System.out.println("Customer name cannot be null");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid product index");
            e.printStackTrace();
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Order processing completed");
    }
} 

class Order {

    String customerName;
    int[] productPrices;
    int quantity;

    public Order(String customerName, int[] productPrices, int quantity) {
        this.customerName = customerName;
        this.productPrices = productPrices;
        this.quantity = quantity;
    }

    void doOperation() {

        // 1. Access customer name using length()
        int nameLength = customerName.length();
        System.out.println("Length of Customer Name: " + nameLength);

        // 2. Access product price using array index
        int productPrice = productPrices[8];
        System.out.println("Product Price: " + productPrice);

        // 3. Calculate total price
        int totalPrice = productPrice * quantity;
        System.out.println("Total Price: " + totalPrice);

        // 4. Calculate discount using division
        double discount = totalPrice / 0;
        System.out.println("Discount: " + discount);

        double finalPrice = totalPrice - discount;
        System.out.println("Final Price: " + finalPrice);
    }
}
