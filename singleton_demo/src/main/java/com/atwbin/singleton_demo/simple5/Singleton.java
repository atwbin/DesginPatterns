package com.atwbin.singleton_demo.simple5;

/**
 * Author：Created by Wbin on 2018/11/2
 *
 * Description：
 * 添加了volatile     好处：防止重排序  线程可见性
 */
public class Singleton {

    private static volatile Singleton mInstance;

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
