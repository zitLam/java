package com.hspedu.innerclass;

/**
 * 演示局部内部类的使用
 */
public class LocalInnerClass {
    public static void main(String[] args) {

    }
}

class Outer02 { //外部类
    private int n1 = 100;
    public void m2() { }
    public void m1() {
        //1. 局部内部类是定义在外部类的局部位置，通常在方法
        //3. 不能添加访问修饰符，但是可以使用final 修饰
        //4. 作用域：仅在定义它的方法或代码块中
        final class Inner02{ //局部内部类
            public int n1 = 300;
            //2. 可以直接访问外部类的所有成员，包含私有的
            public void f1() {
                //5. 局部内部类可以直接访问外部类的成员
                //7. 如果外部类和内部类的成员重名时，默认遵循就近原则；内部类如果想访问外部类的成员
                //  使用外部类名.this.成员 去访问。
                System.out.println("外部类成员n1 = " + Outer02.this.n1);
                System.out.println("n1 = " + n1);
                m2();
            }
        }
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }
}
