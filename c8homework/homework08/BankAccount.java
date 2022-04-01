package com.hspedu.homework.homeworkc8.homework08;

public class BankAccount {
    private int balance;

    public BankAccount(int initialbalance) {
        this.balance = initialbalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public void earnMonthlyInterest() {

    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
