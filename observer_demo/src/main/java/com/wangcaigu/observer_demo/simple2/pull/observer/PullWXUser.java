package com.wangcaigu.observer_demo.simple2.pull.observer;

import com.wangcaigu.observer_demo.simple2.pull.observable.PullWXAdvanceObservable;
import com.wangcaigu.observer_demo.simple2.pull.observable.PullWXPublicObservable;

/**
 * Author：Created by Wbin on 2018/12/12
 *
 * Description：具体的观察者
 */
public class PullWXUser implements IPullWXUser {

    private String name;

    public PullWXUser(String name) {
        this.name = name;
    }

    @Override
    public void pull(PullWXPublicObservable publicObservable) {
        //拉模式   主动的从公众号中拉取一篇文章
        PullWXAdvanceObservable pullWXAdvanceObservable = (PullWXAdvanceObservable) publicObservable;

        System.out.println(name + " 主动拉去一篇文章：" + pullWXAdvanceObservable.getArticle());
    }
}
