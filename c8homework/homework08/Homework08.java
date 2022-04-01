package com.hspedu.homework.homeworkc8.homework08;

public class Homework08 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000);
        checkingAccount.deposit(11);
        System.out.println(checkingAccount.getBalance());
        checkingAccount.withdraw(9);
        System.out.println(checkingAccount.getBalance());

        System.out.println("===============================================");
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(1000);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(500);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.deposit(2000);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());

        // 月初，定时器自动调用earnMonthlyInterest
        savingsAccount.earnMonthlyInterest();
        System.out.println(savingsAccount.getBalance());
    }
}
