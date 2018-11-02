package com.atwbin.singleton_demo.simple6;

/**
 * Author：Created by Wbin on 2018/11/2
 *
 * Description：  静态内部类实现的方式   比较常用
 * 优点  ①： 保证了线程的安全  ②： 用到的时候才new对象
 */
public class Singleton {


    private Singleton() {

    }

    public static Singleton getInstance() {
        return SingletonHolder.mInstance;
    }

    private static class SingletonHolder {
        private static volatile Singleton mInstance;

    }

}
