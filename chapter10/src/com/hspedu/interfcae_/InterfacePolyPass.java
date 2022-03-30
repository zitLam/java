package com.hspedu.interfcae_;

/**
 * 演示多态传递现象
 */
public class InterfacePolyPass {
    public static void main(String[] args) {
      IG ig = new Teacher();
      //如果 IG 继承了 IH 接口，而 Teacher 类实现了 IG 接口
//        那么实际上就相当于 Teacher 类也实现了 IH 接口
      IH ih = new Teacher();
    }
}

interface IH { }
interface IG extends IH { }
class Teacher implements IG {

}
