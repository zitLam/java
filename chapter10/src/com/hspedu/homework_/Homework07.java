package com.hspedu.homework_;

/**
 * @author lamT
 * @version 1.0
 */
public class Homework07 {
    public static void main(String[] args) {
        Car car1 = new Car(41);
        Car car2 = new Car(-3);
        Car car3 = new Car(28);
        car1.getAir().flow();
        car2.getAir().flow();
        car3.getAir().flow();
    }
}

class Car {
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class getAir {
        public void flow() {
            if (temperature > 40){
                System.out.println("超高温！！冷气已打开，正在吹风中。。。");
            } else if (temperature < 0) {
                System.out.println("超低温！！暖气已打开，正在吹风中。。。");
            } else {
                System.out.println("温度适宜，空调关闭");
            }

        }
    }
    public getAir getAir(){
        return new getAir();
    }

}