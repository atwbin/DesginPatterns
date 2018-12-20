package com.wangcaigu.proxy_demo.simple1;

/**
 * Author：Created by Wbin on 2018/12/18
 *
 * Description：被代理对象
 */
public class Man implements IBank {

    private String name;

    public Man(String name) {
        this.name = name;
    }

    /**
     * 自己的一些操作
     */
    @Override
    public void applyBank() {
        System.out.println(name + " 申请办理业务");
    }
}
