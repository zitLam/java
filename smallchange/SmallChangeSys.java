package com.hspedu.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class SmallChangeSys {

    //化繁为简  面向过程：
    //1. 先完成显示菜单，并可以选择菜单，给出对应提示
    //2. 完成零钱通明细
    //3. 完成收入入账
    //4. 完成消费支出
    //5. 改进：设置合理性判断

    public static void main(String[] args) {

        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";

        String details = "------------------- 零钱通明细 --------------------";

        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        String note = "";

        do {
            System.out.println("\n============== 零钱通菜单 =============");
            System.out.println("\t\t\t1. 查看零钱明细");
            System.out.println("\t\t\t2. 收益入账");
            System.out.println("\t\t\t3. 消费支出");
            System.out.println("\t\t\t4. 退   出");
            System.out.print("请选择:>");
            key = scanner.next();
            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":   //2. 完成零钱通明细
                    System.out.print("收益入账:>");
                    money = scanner.nextDouble();
                    while (money <= 0) {
                        System.out.print("输入金额有误，请重新输入:>");
                        money = scanner.nextDouble();
                    } // 判断输入金额是否正确
                    balance += money;
                    date = new Date();
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t余额：" + balance;
                    System.out.println(details);
                    break;
                case "3":   //3. 完成收益入账
                    System.out.print("消费支出:>");
                    money = scanner.nextDouble();
                    while (money <= 0 || money > balance) {
                        System.out.println("你的消费金额应该在 0-" + balance);
                        money = scanner.nextDouble();
                        balance += money;
                    } // 判断输入金额是否正确
                    System.out.print("消费说明:>");
                    note = scanner.next();
                    balance -= money;
                    date = new Date();
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t余额：" + balance;
                    System.out.println(details);
                    break;
                case "4":
                    System.out.println("4. 退出");
                    String choice = "";

                    while (true) {
                        System.out.println("确认退出吗？请输入(y/n)");
                        choice = scanner.next();
                        if ("y".equals(choice) || "n".equals(choice)){
                            break;
                        }
                    }
                    if (choice.equals("y")){
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
            }
        }while (loop);

        System.out.println("---------已退出零钱通钱包----------");
    }
}
