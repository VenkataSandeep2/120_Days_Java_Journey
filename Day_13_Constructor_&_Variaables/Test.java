package com.constructor;

class BankAccount {

    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) 		//Constructor
    {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class Test2 {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount("Sanjay", 5000);

        acc.display();
    }
}
