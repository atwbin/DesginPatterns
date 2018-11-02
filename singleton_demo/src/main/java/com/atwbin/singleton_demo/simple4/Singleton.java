package com.atwbin.singleton_demo.simple4;

/**
 * Author：Created by Wbin on 2018/11/2
 *
 * Description：
 * 通过加锁synchronized  解决了simple2中线程不安全的问题
 * 优点：既保证效率  也保证线程的安全
 * 缺点：需要加上volatile
 */
public class Singleton {

    private static Singleton mInstance;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if (mInstance == null) {
            synchronized (Singleton.class) {
                if (mInstance == null) {
                    mInstance = new Singleton();
                }
            }
        }
        return mInstance;
    }

}
