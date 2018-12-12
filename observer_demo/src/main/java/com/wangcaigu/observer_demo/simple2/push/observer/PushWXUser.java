package com.wangcaigu.observer_demo.simple2.push.observer;


/**
 * Author：Created by Wbin on 2018/12/12
 *
 * Description：
 */
public class PushWXUser implements IPushWXUser {

    private String name;

    public PushWXUser(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void push(String article) {
        System.out.println(name + " 收到了推送的一篇文章：" + article);
    }
}
