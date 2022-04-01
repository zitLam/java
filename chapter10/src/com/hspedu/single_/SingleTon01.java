package com.hspedu.single_;

/**
 * 演示饿汉式的单例模式：存在浪费资源问题
 */
public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend gf = GirlFriend.getInstance();
    }

}

//有一个类，GirlFriend
//只能有一个女朋友
class GirlFriend {

    private  String name;
    //为了能够在静态方法中返回gf对象，需要将该属性修饰为static
    private static GirlFriend gf = new GirlFriend("小甜甜");
    //保障我们只能创建一个 GirlFriend 对象
    //步骤：【饿汉式】
//    1. 将构造器私有化
//    2. 在类的内部直接创建对象
//    3. 提供一个公共的static方法，返回 gf 对象
    private GirlFriend(String name) {
        this.name = name;
    }

    public static GirlFriend getInstance() {
        return gf;
    }
}
