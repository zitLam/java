package com.hspedu.homework_;

/**
 * @author lamT
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        System.out.println("第一件上衣的序列号: " + Frock.getNextNum());
        System.out.println("第二件上衣的序列号: " + Frock.getNextNum());
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        Frock frock3 = new Frock();
        System.out.println("第三件编号：" + frock1.getSerialNumber()
                + "\n第四件编号：" + frock2.getSerialNumber()
                + "\n第五件编号：" + frock3.getSerialNumber());
    }
}

class Frock {
    private static int currentNum = 100000;
    private int serialNumber;

    public Frock() {
        this.serialNumber = getNextNum();
    }

    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}
