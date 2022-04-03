package com.hspedu.exception_;

import java.util.Scanner;

/**
 * @author lamT
 * @version 1.0
 */
public class TryCatchExercise04 {
    public static void main(String[] args) {
        A.f1();
    }
}

class A{
    public static void f1() {
        try {
            System.out.print("请输入整数:> ");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.next();
            int n = Integer.parseInt(str);
            System.out.println("你输入的整数为:> " + str);
        } catch (NumberFormatException e) {
            System.out.println("你输入的不是整数！");
            f1();
        }
    }
}