package com.hspedu.homework.homeworkc8.homework10;

public class Homework10 {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("张三", 40, "内科医生", '男', 15000);
        Doctor d2 = new Doctor("张三", 40, "内科医生", '男', 15000);
        System.out.println(d1.equals(d2));
    }
}
