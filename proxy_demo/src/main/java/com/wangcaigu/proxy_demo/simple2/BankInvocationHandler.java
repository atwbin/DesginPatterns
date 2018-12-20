package com.wangcaigu.proxy_demo.simple2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Author：Created by Wbin on 2018/12/18
 *
 * Description：动态代理实现类
 */
public class BankInvocationHandler implements InvocationHandler {

    private Object mObj;

    public BankInvocationHandler(Object obj) {
        this.mObj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始受理");
        Object object = method.invoke(mObj, args);
        System.out.println("受理完毕");
        return object;
    }
}
