package com.atwbin.singleton_demo.simple3;

/**
 * Author：Created by Wbin on 2018/11/2
 *
 * Description：
 * 通过加锁synchronized  解决了simple2中线程不安全的问题
 * 缺点：效率不高   因为每次都要经过同步锁的判断
 */
public class Singleton {

    private static Singleton mInstance;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if (mInstance == null) {
            mInstance = new Singleton();
        }
        return mInstance;
    }

}
