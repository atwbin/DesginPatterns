package com.wangcaigu.observer_demo.simple2.push.observable;

import com.wangcaigu.observer_demo.simple2.push.observer.IPushWXUser;

import java.util.ArrayList;
import java.util.List;

/**
 * Author：Created by Wbin on 2018/12/12
 *
 * Description： 被观察者
 */
public class PushWXPublicObservable {


    //所有用户的订阅者
    private List<IPushWXUser> mWXUser;

    public PushWXPublicObservable() {
        mWXUser = new ArrayList<>();
    }

    /**
     * 订阅
     */
    public void register(IPushWXUser user) {
        mWXUser.add(user);
    }

    /**
     * 解除订阅
     */
    public void unregister(IPushWXUser user) {
        mWXUser.remove(user);
    }

    /**
     * 更新文章
     */
    public void update(String article) {
        for (IPushWXUser iPushWXUser : mWXUser) {
            iPushWXUser.push(article);
        }
    }
}
