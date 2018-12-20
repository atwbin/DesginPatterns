package com.wangcaigu.proxy_demo.simple2;


import java.lang.reflect.Proxy;

/**
 * Author：Created by Wbin on 2018/12/18
 *
 * Description： 动态代理
 */
public class Client {


    public static void main(String[] args) {

        Man man = new Man("WBIN");

        IBank iBank = (IBank) Proxy.newProxyInstance(IBank.class.getClassLoader(), // ClassLoader
                new Class<?>[]{IBank.class},//目标接口
                new BankInvocationHandler(man)); // 根据业务需要实现的类

        iBank.applyBank();
        iBank.lostBank();
    }


}
