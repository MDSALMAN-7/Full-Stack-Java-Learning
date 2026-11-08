package com.learning.constructors2;

public class BankCustomer {

    String name;
    String accountNumber;
    double balance;

    // Default constructor
    public BankCustomer() {

    }

    // Parameterized constructor
    public BankCustomer(String _name, String _accountNumber, double _balance) {

        this.name = _name;
        this.accountNumber = _accountNumber;
        this.balance = _balance;
    }
}
