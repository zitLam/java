package com.hspedu.enum_;

/**
 * @author lamT
 * @version 1.0
 */
public class Homework {
    public static void main(String[] args) {
        switch (Color.GERRN) {
            case GERRN:
                Color.GERRN.show();
                break;
            case RED:
                Color.RED.show();
                break;
        }
    }
}

interface A {
    public void show();
}
enum Color implements A {
    RED(255, 0, 0), BLUE(0, 0, 255),
    BLACK(0, 0, 0), YELLOW(255, 255, 0),
    GERRN(0, 255, 0),
    ;
    private int redValue;
    private int greenValue;
    private int blueValue;

    private Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Color{" +
                "redValue=" + redValue +
                ", greenValue=" + greenValue +
                ", blueValue=" + blueValue +
                '}';
    }
}
