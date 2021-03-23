package com.example.interfaceprograms;

public class BankAccount {
    private double balance;
    private int accountnumber;
    private static int lastAssigneNumber = 1000;

    public BankAccount(double balance) {
        this.balance = balance;
        lastAssigneNumber++;
        accountnumber=lastAssigneNumber;

    }

    public double getBalance() {
        return balance;
    }
}
