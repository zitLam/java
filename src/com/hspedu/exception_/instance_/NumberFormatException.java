package com.hspedu.exception_.instance_;

/**
 * @author lamT
 * @version 1.0
 */
public class NumberFormatException {
    public static void main(String[] args) {
        //数字格式不正确异常
        String name = "okBoom";
        int num = Integer.parseInt(name);
        System.out.println(num);
    }
}
