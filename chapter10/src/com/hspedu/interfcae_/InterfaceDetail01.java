package com.hspedu.interfcae_;

public class InterfaceDetail01 {
    public static void main(String[] args) {

    }
}

//1. 接口不能被实例化
//2. 接口中所有的方法是public 方法，接口中抽象方法，可以不用abstract 修饰
//3. 一个普通类实现接口，就必须将该接口的所有方法都实现，可以使用 alt+enter来解决
//4. 抽象类实现接口时，可以不用实现接口的方法
interface IA {
    void say();
    void hi();
}

class Cat implements IA{
    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}

abstract class Tiger implements IA {

}
