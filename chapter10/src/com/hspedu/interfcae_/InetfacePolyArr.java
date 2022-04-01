package com.hspedu.interfcae_;

/**
 * 演示接口的多态数组、向下转型
 */
public class InetfacePolyArr {
    public static void main(String[] args) {
        Usb[] usbs = new Usb[2];
        usbs[0] = new Phone();
        usbs[1] = new Camera();
        for (int i = 0; i < usbs.length; i++) {
            System.out.print((i + 1) + "、");
            usbs[i].use();
            if (usbs[i] instanceof Phone) {
                ((Phone) usbs[i]).call();
            }
        }
    }
}

interface Usb {
    void use();
}

class Phone implements Usb {
    public void call() {
        System.out.println("正在通话中。。");
    }

    @Override
    public void use() {
        System.out.println("电话已接入");
    }
}
class Camera implements Usb {

    @Override
    public void use() {
        System.out.println("相机已接入");
    }
}
