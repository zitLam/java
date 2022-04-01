package com.hspedu.enum_;

/**
 * @author lamT
 * @version 1.0
 * 演示Enum类的各种方法的使用
 */
public class EnumMethod {
    public static void main(String[] args) {
        //使用Seasons 枚举类，来演示各种方法
        Seasons spring = Seasons.SPRING;

        //name：返回当前对象名（常量名），子类中不能重写
        System.out.println(spring.name());

        //ordinal：返回当前对象的位置号，默认从0开始
        System.out.println(spring.ordinal());

        //values(隐藏方法，需要通过反编译才能看到该方法)：返回当前枚举类中所有的常量
        Seasons[] values = Seasons.values();
        System.out.println("=== 遍历取出枚举类对象（增强for) ===");
        // 增强for循环 👇
        for (Seasons seasons: values) {
            System.out.println(seasons);
        }

        //valueOf：将字符串转换成枚举对象，要求字符串必须为已有的常量名，否则报异常！
        System.out.println("=== 演示valueOf ===");
        Seasons seasons = Seasons.valueOf("WINTER");
        System.out.println(seasons);

        //compareTo：比较两个枚举常量，比较的就是编号！
        System.out.println("=== 演示compareTo ===");
        System.out.println(spring.compareTo(Seasons.WINTER));
    }
}
