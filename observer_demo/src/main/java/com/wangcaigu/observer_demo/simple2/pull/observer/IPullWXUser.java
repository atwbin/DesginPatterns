package com.wangcaigu.observer_demo.simple2.pull.observer;

import com.wangcaigu.observer_demo.simple2.pull.observable.PullWXPublicObservable;

/**
 * Author：Created by Wbin on 2018/12/12
 *
 * Description：观察者
 */
public interface IPullWXUser {

    /**
     * 拉取公众号
     */
    void pull(PullWXPublicObservable publicObservable);
}
