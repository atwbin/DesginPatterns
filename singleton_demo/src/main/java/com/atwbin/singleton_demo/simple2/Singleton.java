package com.atwbin.singleton_demo.simple2;

/**
 * Author：Created by Wbin on 2018/11/2
 *
 * Description：  懒汉式
 * 缺点：多线程并发的时候，可能会产生多个实例，  也就是线程不安全
 * 优点：只有在使用的时候 才会去new对象   更加高效
 */
public class Singleton {

    private static Singleton mInstance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (mInstance == null) {
            mInstance = new Singleton();
        }
        return mInstance;
    }

}
