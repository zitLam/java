package com.hspedu.final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        Circle.setRadius(7);
        System.out.println(Circle.area());
    }
}

class Circle {
    private static double radius;
    private final static double PI = 3.14;

    public Circle() {
    }

    public static void setRadius(double radius) {
        Circle.radius = radius;
    }

    public static double area() {
        return PI * radius * radius;
    }
}
