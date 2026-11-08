package com.learning.constructors2;

public class BankCustomerDriver {

    public static void main(String[] args) {

        // Creating three objects
        BankCustomer bc1 = new BankCustomer("Salman", "101", 50000);
        BankCustomer bc2 = new BankCustomer("Rahul", "102", 30000);
        BankCustomer bc3 = new BankCustomer();

        // Changing balance of only one object
        bc1.balance = 75000;

        // Printing first customer
        System.out.println("Customer 1:");
        System.out.println("Name: " + bc1.name);
        System.out.println("Account Number: " + bc1.accountNumber);
        System.out.println("Balance: " + bc1.balance);

        // Printing second customer
        System.out.println("\nCustomer 2:");
        System.out.println("Name: " + bc2.name);
        System.out.println("Account Number: " + bc2.accountNumber);
        System.out.println("Balance: " + bc2.balance);

        // Printing third customer
        System.out.println("\nCustomer 3:");
        System.out.println("Name: " + bc3.name);
        System.out.println("Account Number: " + bc3.accountNumber);
        System.out.println("Balance: " + bc3.balance);
    }
}
