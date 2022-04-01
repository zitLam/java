package com.hspedu.abstract_.template_;

abstract public class Template {
    public void calculateTime() {
        //得到开始的时间
        long start = System.currentTimeMillis();
        job();
        //得到结束时间
        long end = System.currentTimeMillis();
        System.out.println("job执行时间=" + (end - start));
    }
    abstract public void job();
}
