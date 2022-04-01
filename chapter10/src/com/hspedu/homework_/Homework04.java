package com.hspedu.homework_;

/**
 * @author lamT
 * @version 1.0
 */
public class Homework04 {
    public static void main(String[] args) {

    }
}

/*
1. 计算机接口具有work方法，功能是运算，有一个手机类Cellphone，定义方法testWork测试计算功能。调用计算机接口的work方法。
2. 要求调用Cellphone对象的testWork方法，使用上 匿名内部类
 */

interface ICalculate {
    public double work(double n1, double n2);
}

