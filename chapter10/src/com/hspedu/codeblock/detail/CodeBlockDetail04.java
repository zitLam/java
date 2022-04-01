package com.hspedu.codeblock.detail;

public class CodeBlockDetail04 {
    public static void main(String[] args) {
        new BB();//创建一个BB对象，调用顺序应为：5、1、9、6、4、2、3、10、7、8
        System.out.println("===========我是分割线==============");
        BB bb = new BB();//普通代码块及普通属性每创建一次则执行一次 && 静态代码块及静态属性仅在类加载时执行一次
    }
}

class AA {
    private static int a = getA();
    private int aa = getAa();

    static {
        System.out.println("1、我是AA的静态代码块");//1
    }
    {
        System.out.println("2、我是AA的普通码块");//2
    }

    public AA() {
        System.out.println("3、我是AA的无参构造器");//3
    }

    public int getAa() {
        System.out.println("4、我是AA的普通属性初始化");//4
        return aa;
    }

    public static int getA() {
        System.out.println("5、我是AA的静态属性初始化");//5
        return a;
    }
}

class BB extends AA {

    private static int b = getB();
    private int bb = getBb();

    static {
        System.out.println("6、我是BB的静态代码块");//6
    }

    {
        System.out.println("7、我是BB的普通代码块");//7
    }

    public BB() {
        System.out.println("8、我是BB的无参构造器");//8
    }

    public static int getB() {
        System.out.println("9、我是BB的静态属性");//9
        return b;
    }

    public int getBb() {
        System.out.println("10、我是BB的普通属性");//10
        return bb;
    }
}