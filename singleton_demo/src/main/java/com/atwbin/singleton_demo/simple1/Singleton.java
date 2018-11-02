package com.atwbin.singleton_demo.simple1;

/**
 * Author：Created by Wbin on 2018/11/2
 *
 * Description：  饿汉式
 * 缺点： 随着类的加载就已经new了对象
 */
public class Singleton {

    private static Singleton mInstance = new Singleton();

    private Singleton() {

    }


    public static Singleton getInstance() {
        return mInstance;
    }
}
