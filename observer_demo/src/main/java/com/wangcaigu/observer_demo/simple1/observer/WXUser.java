package com.wangcaigu.observer_demo.simple1.observer;

/**
 * Author：Created by Wbin on 2018/12/12
 *
 * Description： 具体的订阅者
 */
public class WXUser implements IWXUser {

    private String name;

    public WXUser(String name) {
        this.name = name;
    }

    @Override
    public void push(String article) {
        System.out.println(name + "：收到一篇文章!!!" + article);
    }
}
