package com.hspedu.exception_.c12homework_;

/**
 * @author lamT
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            double ret = cal(n1, n2);
            System.out.println("计算结果是= " + ret);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("参数格式不正确，需要输出整数");
        } catch (ArithmeticException e) {
            System.out.println("出现除0的异常");
        }
    }

    private static double cal (int n1, int n2) {
        return n1 / n2;
    }
}


