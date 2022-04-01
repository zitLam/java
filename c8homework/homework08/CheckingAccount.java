package com.hspedu.homework.homeworkc8.homework08;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(int initialbalance) {
        super(initialbalance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);
    }
}
