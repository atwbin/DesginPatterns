package com.wangcaigu.proxy_demo.simple2;

/**
 * Author：Created by Wbin on 2018/12/18
 *
 * Description：
 */
public class Man implements IBank {

    private String name;

    public Man(String name) {
        this.name = name;
    }

    @Override
    public void applyBank() {
        System.out.println(name+" 申请了办卡");
    }

    @Override
    public void lostBank() {
        System.out.println(name+" 卡丢失了");
    }
}
